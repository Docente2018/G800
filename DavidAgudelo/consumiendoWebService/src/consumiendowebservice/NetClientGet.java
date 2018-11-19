/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumiendowebservice;

/**
 *
 * @author agudelofd
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONException;

public class NetClientGet {

    // http://localhost:8080/RESTfulExample/json/product/get
    public static void main(String[] args) throws JSONException, IOException {

        Country country = ConsumirWebService.searchFisrtCountry("col");
        printCountry(country);
        crearArchivo(country);

    }
    
    /**
     * pintamos el response del webservice
     * @param country 
     */
    private static void printCountry(Country country) {
        System.out.println("nombre ciudad " + country.getName() + ", cod 1 " + country.getAlpha2_code() + " cod 2 " + country.getAlpha3_code());
    }

    private static void crearArchivo(Country country) throws IOException {
        String ruta = "archivo.txt";//Ruta donde se creara el archivo 
        File archivo = new File(ruta); //le asignamos la ruta a un archivo
        BufferedWriter bw;
        FileWriter fw = null;
        if (archivo.exists()) {//revisamos si el archivo existe
            fw = new FileWriter(archivo.getAbsoluteFile(), true); 
            bw = new BufferedWriter(fw);
            bw.newLine();
            bw.append(country.getName() + "     " + country.getAlpha2_code() + "      " + country.getAlpha3_code());
        } else {//Si no existe le ponemos titulo
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("CIUDAD        COD1        COD2");
            bw.newLine();
            bw.append(country.getName() + "     " + country.getAlpha2_code() + "    " + country.getAlpha3_code());
        }
        bw.close();
    }

}
