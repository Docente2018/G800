/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumiendowebservice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author agudelofd
 */
public class ConsumirWebService {

    public static Country searchFisrtCountry(String col) throws JSONException {

        Country country = new Country();
        try {

            URL url = new URL("http://services.groupkt.com/country/search?text=" + col);//url del web service mas el parametro
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");//ESpecificamos tipo de servicio
            conn.setRequestProperty("Accept", "application/json");//indicamos que es json
            //add request header

            int responseCode = conn.getResponseCode();//tomamos el codigo de respuesta

            if (conn.getResponseCode() != 200) {//si el codigo es diferente a 200 (codigo de ejecucion correcta) entonces informamos del error
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            } else {
                System.out.println("Response Code : " + responseCode);
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            String output;
            StringBuilder sb = new StringBuilder();
//            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {//convertimos la respuesta http a String
                sb.append(output);
            }
            JSONObject json = new JSONObject(sb.toString());//Convertimos el String a Json
//            System.out.println(" json " + json.toString());
            JSONArray names = json.getJSONObject("RestResponse").getJSONArray("result"); //Tomamos el String que esta dentro del Json
            JSONObject json2 = new JSONObject(names.toString().replaceFirst("\\[", "").replace("\\]", ""));//Retiramos caracateres y convertimos el String a Json
            
            /**
             * mapeamos la respuesta en un objeto
             */
            country.setName((String) json2.get("name"));
            country.setAlpha2_code((String) json2.get("alpha2_code"));
            country.setAlpha3_code((String) json2.get("alpha3_code"));

            conn.disconnect();//Serramos la conexion HTTP

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return country;//Reronamos objeto
    }
}
