/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.uninpahu.controller;

import edu.co.uninpahu.model.ArrayOfVOESPECIESOPRODUCTOSAGRICOLAS;
import edu.co.uninpahu.model.ArrayOfVOEXPCULTIVOASISTPROD;
import edu.co.uninpahu.model.VOESPECIESOPRODUCTOSAGRICOLAS;
import edu.co.uninpahu.model.VOEXPCULTIVOASISTPROD;
import edu.co.uninpahu.model.WSCOSTANCIAS;
import edu.co.uninpahu.model.WSCOSTANCIASSoap;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author ADMIN
 */
@Named(value = "exportadorProductos")
@RequestScoped
public class ExportadorProductos {

    private WSCOSTANCIASSoap port;

    private static final String USUARIO = "VUELVEN12";
    private static final String CONTRASENIA = "Cargonet2018*";
    private static final String IP_EQUIPO = "192.168.1.108";
    private int idEspecie;
    private List<VOESPECIESOPRODUCTOSAGRICOLAS> especies;
    private List<VOEXPCULTIVOASISTPROD> exportadorProductos;
    private VOESPECIESOPRODUCTOSAGRICOLAS seletedEspecie;
    private VOEXPCULTIVOASISTPROD seletedExportadorProductos;

    /**
     * Creates a new instance of ExportadorProductos
     */
    public ExportadorProductos() {
    }

    //Consumo el WS de consultarEspecies
    public List<VOESPECIESOPRODUCTOSAGRICOLAS> getEspecies() {
        if (especies == null) {
            ArrayOfVOESPECIESOPRODUCTOSAGRICOLAS arr = consultarEspecies(USUARIO, CONTRASENIA, IP_EQUIPO);
            especies = arr.getVOESPECIESOPRODUCTOSAGRICOLAS();
        }
        return especies;
    }

    //Consumo el WS de consultarExportadorCultivosProductos
    public List<VOEXPCULTIVOASISTPROD> getExportadorCultivosProductos() {
        if (exportadorProductos == null) {
            ArrayOfVOEXPCULTIVOASISTPROD arr = consultarExportadorCultivosProductos(null, idEspecie, USUARIO, CONTRASENIA, IP_EQUIPO);
            exportadorProductos = arr.getVOEXPCULTIVOASISTPROD();
        }
        return exportadorProductos;
    }

    public void guardarLista(Object o) {
        String textoGuardar = "";
        for (Object ob : (List<Object>) o) {
            if (ob instanceof VOEXPCULTIVOASISTPROD) {
                textoGuardar += "Id Especie: " + seletedEspecie.getId() + "\n";
                textoGuardar += "Id Cultivos: " + ((VOEXPCULTIVOASISTPROD) ob).getIdCultivos()+ "\n";
                textoGuardar += "Nombre del cultivo: " + ((VOEXPCULTIVOASISTPROD) ob).getNombreCultivo() + "\n";
                textoGuardar += "Estado del producto: " + ((VOEXPCULTIVOASISTPROD) ob).getResultadoPrueba() + "\n";
            }
            if (ob instanceof VOESPECIESOPRODUCTOSAGRICOLAS) {
                textoGuardar += "Id: " + ((VOESPECIESOPRODUCTOSAGRICOLAS) ob).getId() + "\n";
                textoGuardar += "Descripcion: " + ((VOESPECIESOPRODUCTOSAGRICOLAS) ob).getDescripcion() + "\n";
                textoGuardar += "Resultado Consulta: " + ((VOESPECIESOPRODUCTOSAGRICOLAS) ob).getResultadoConsulta() + "\n";
            }
            textoGuardar += "\n";
        }

        Archivo a = new Archivo();
        System.out.println(a.escribirArchivo("../../../../../Log", textoGuardar));
    }

    //optengo el port del servicio para realizar las peticiones de todas las operaciones
    private WSCOSTANCIASSoap getPort() {
        try {
            if (port == null) {
                WSCOSTANCIAS service = new WSCOSTANCIAS();
                port = service.getWSCOSTANCIASSoap();
            }
        } catch (Exception e) {
            System.out.println(e.getCause());
            return null;
        }

        return port;
    }

    private ArrayOfVOEXPCULTIVOASISTPROD consultarExportadorCultivosProductos(java.lang.String numeroIdentificacion, int idEspecie, java.lang.String usuario, java.lang.String contrasena, java.lang.String ipEquipo) {
        return getPort().consultarExportadorCultivosProductos(numeroIdentificacion, idEspecie, usuario, contrasena, ipEquipo);
    }

    private ArrayOfVOESPECIESOPRODUCTOSAGRICOLAS consultarEspecies(java.lang.String usuario, java.lang.String contraseña, java.lang.String ipEquipo) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        return getPort().consultarEspecies(usuario, contraseña, ipEquipo);
    }

    public int getIdEspecie() {
        return idEspecie;
    }

    public void setIdEspecie(int idEspecie) {
        this.idEspecie = idEspecie;
    }

    public VOESPECIESOPRODUCTOSAGRICOLAS getSeletedEspecie() {
        return seletedEspecie;
    }

    public void setSeletedEspecie(VOESPECIESOPRODUCTOSAGRICOLAS seletedEspecie) {
        this.seletedEspecie = seletedEspecie;
    }

    public VOEXPCULTIVOASISTPROD getSeletedExportadorProductos() {
        return seletedExportadorProductos;
    }

    public void setSeletedExportadorProductos(VOEXPCULTIVOASISTPROD seletedExportadorProductos) {
        this.seletedExportadorProductos = seletedExportadorProductos;
    }

}
