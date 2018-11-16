/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author UsuarioPC
 */
@WebService(serviceName = "CalculadoraWS")
public class CalculadoraWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Sumar")
    public int Sumar(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        return a+b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Restar")
    public int Restar(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        return a-b;
    }
}
