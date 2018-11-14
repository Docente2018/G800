/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icawsconsola;

import edu.co.uninpahu.ws.ArrayOfVOESPECIESOPRODUCTOSAGRICOLAS;
import edu.co.uninpahu.ws.ArrayOfVOEXPCULTIVOASISTPROD;
import edu.co.uninpahu.ws.VOESPECIESOPRODUCTOSAGRICOLAS;
import edu.co.uninpahu.ws.VOEXPCULTIVOASISTPROD;
import edu.co.uninpahu.ws.VOIVPRESENTACIONES;
import edu.co.uninpahu.ws.WSCOSTANCIAS;
import edu.co.uninpahu.ws.WSCOSTANCIASSoap;

/**
 *
 * @author ADMIN
 */
public class IcaWSConsola {

    public static final String USUARIO = "VUELVEN12";
    public static final String CONTRASENIA = "Cargonet2018*";
    public static final String IP_EQUIPO = "192.168.1.108";
    private static WSCOSTANCIASSoap port;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Especies de productos agricolas");
        for (VOESPECIESOPRODUCTOSAGRICOLAS especiesoProductosAgricola : consultarEspecies().getVOESPECIESOPRODUCTOSAGRICOLAS()) {
            System.out.println("Id: " + especiesoProductosAgricola.getId());
            System.out.println("Descripcion: " + especiesoProductosAgricola.getDescripcion());
            if (especiesoProductosAgricola.getPresentaciones() != null) {
                System.out.println("\tPresentaciones");
                for (VOIVPRESENTACIONES presentacion : especiesoProductosAgricola.getPresentaciones().getVOIVPRESENTACIONES()) {
                    System.out.println("ID_Presentacion: " + presentacion.getIdPresentacion());
                    System.out.println("Presentacion: " + presentacion.getPresentacion());
                }
            }
            for (VOEXPCULTIVOASISTPROD expcultivoasistprod : consultarExportadorCultivosProductos(null, especiesoProductosAgricola.getId()).getVOEXPCULTIVOASISTPROD()) {
                System.out.println("Estado del producto: " + expcultivoasistprod.getResultadoPrueba());
                System.out.println("Nombre del cultivo: " + expcultivoasistprod.getNombreCultivo());
            }

            System.out.println("");
        }
    }

    private static ArrayOfVOESPECIESOPRODUCTOSAGRICOLAS consultarEspecies() {
        return getPort().consultarEspecies(USUARIO, CONTRASENIA, IP_EQUIPO);
    }

    private static ArrayOfVOEXPCULTIVOASISTPROD consultarExportadorCultivosProductos(java.lang.String numeroIdentificacion, int idEspecie) {
        return getPort().consultarExportadorCultivosProductos(numeroIdentificacion, idEspecie, USUARIO, CONTRASENIA, IP_EQUIPO);
    }

    private static WSCOSTANCIASSoap getPort() {
        if (port == null) {
            WSCOSTANCIAS service = new WSCOSTANCIAS();
            port = service.getWSCOSTANCIASSoap();
        }
        return port;
    }

}
