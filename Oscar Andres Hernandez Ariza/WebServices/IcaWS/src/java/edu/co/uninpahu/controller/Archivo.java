/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.uninpahu.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author ADMIN
 */
public class Archivo {

    private File flArchivo;
    private String Ruta_del_archivo;
    private BufferedWriter bwEscritor;
    private FileWriter fwArchivo_en_el_que_escribir;

    public String escribirArchivo(String nombreFile, String TextoAGuardar) {
        String mTextos[] = TextoAGuardar.split("\n"), respuesta = "";//Se detecta el salto de linea, se va colocando en el vector.

        Ruta_del_archivo = "" + nombreFile + ".txt";
        flArchivo = new File(Ruta_del_archivo);
        try {
            //Este bloque de codigo obligatoriamente debe ir dentro de un try.
            fwArchivo_en_el_que_escribir = new FileWriter(flArchivo);//De momento se deja hasta aqui, listo para escribir, se escribe en el momento de dar la orden.
            for (int i = 0; i <= mTextos.length - 1; i++) {
                //Se va escribiendo cada linea en el archivo de texto.
                fwArchivo_en_el_que_escribir.write(mTextos[i] + "\r\n");
            }//for
            //Este metodo escribe el archivo en el disco duro.
            bwEscritor = new BufferedWriter(fwArchivo_en_el_que_escribir);
            bwEscritor.close();//Se cierra el archivo.	
            respuesta = "Se a creado el archivo " + Ruta_del_archivo + " exitosamente";
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            respuesta = "Fallo al crear el archivo";
        }
        return respuesta;
    }

}
