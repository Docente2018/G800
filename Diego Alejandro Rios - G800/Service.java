/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda.faltMap;

/**
 *
 * @author andres
 */
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.jws.*;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Service {

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException, JSONException {
        // TODO Auto-generated method stub

        consumir();

    }

    public static NodeList imprimeLista(NodeList lista) {
        for (int index = 0; index < lista.getLength(); index++) {
            System.out.println(lista.item(index).getNodeName() + " " + lista.item(index).getTextContent());

        }
        return lista;

    }

    public static void consumir() throws IOException, ParserConfigurationException, SAXException, JSONException {
        URL url = new URL("http://indicadoresdeldia.cl/webservice/indicadores.xml");
        URLConnection urlConnection = url.openConnection();
        urlConnection.addRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1)");
        InputStream input = new BufferedInputStream(urlConnection.getInputStream());
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(input);
        NodeList listaSantoral = doc.getElementsByTagName("santoral").item(0).getChildNodes();
        NodeList listaMoneda = doc.getElementsByTagName("moneda").item(0).getChildNodes();
        JSONObject obj = new JSONObject();
        String ruta = "/home/andres/archivo.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if (archivo.exists()) {
            // El fichero ya existe
            bw = new BufferedWriter(new FileWriter(archivo));
//            imprimeLista(listaSantoral);
//            imprimeLista(listaMoneda);
            NodeList listaMon = imprimeLista(listaMoneda);
            for (int index = 0; index < listaMon.getLength(); index++) {
                bw.write(listaMon.item(index).getNodeName() + " " + listaMon.item(index).getTextContent());
            }
            NodeList listaSanto = imprimeLista(listaSantoral);
            for (int index = 0; index < listaSanto.getLength(); index++) {
                bw.write(listaSanto.item(index).getNodeName() + " " + listaSanto.item(index).getTextContent());
            }

        } else {
            // El fichero no existe y hay que crearlo
            bw = new BufferedWriter(new FileWriter(archivo));
//            imprimeLista(listaSantoral);
//            imprimeLista(listaMoneda);
            NodeList listaMon = imprimeLista(listaMoneda);
            for (int index = 0; index < listaMon.getLength(); index++) {
                bw.write(listaMon.item(index).getNodeName() + " " + listaMon.item(index).getTextContent());
            }
            NodeList listaSanto = imprimeLista(listaSantoral);
            for (int index = 0; index < listaSanto.getLength(); index++) {
                bw.write(listaSanto.item(index).getNodeName() + " " + listaSanto.item(index).getTextContent());
            }
            obj.put("num", new Integer(100));
            obj.put("balance", new Double(1000.21));
            obj.put("is_vip", new Boolean(true));

            System.out.print(obj);
        }
        bw.close();

    }

}
