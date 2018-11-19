<?php

namespace App\Controllers;

use \Core\View;
use \App\Models;

class Home extends \Core\Controller
{
	public function index(){}

    public function getProductos()
    {
    	$a = new Models\Productos();
    	$ar = $a->getAll();

    	echo json_encode($ar);
    }

    public function getTiposDocumento(){
    	$tipos_doc = new Models\Tipos_Documento();
    	$tipos = $tipos_doc->getAllTypes();

    	echo json_encode($tipos);
    }

    public function getAllClientes(){
    	$clientes = new Models\Clientes();
    	$cl = $clientes->getAllCustomers();

    	echo json_encode($cl);
    }

    public function insertCliente(){
    	$cliente = $_POST["cliente"];
    	$clientes = new Models\Clientes();
    	$cl = $clientes->insertCustomer($cliente);
    }

    public function getVentas(){
    	$ventas = new Models\Ventas();
    	$ven = $ventas->getAll();

    	echo json_encode($ven);

    }

    public function insertVenta(){
    	$ventas = $_POST["ventas"];
    	$ventaObj = new Models\Ventas();
    	$productos = new Models\Productos();

    	$valorCompra = 0;
    	foreach ($ventas["productos"] as $prd) {
    		$product = (int)$prd;
    		$precio = $productos->getPriceProducts($product);
    		$valorCompra = $valorCompra + $precio[0]["precio"];
    	}

    	$arrVentas = array(
    		"valor" => $valorCompra,
    		"cliente_id" => $ventas["cliente_id"],
    		"cantidad_productos" => $ventas["cant_productos"],
    		"desc_venta" => $ventas["descripcion"]
    	);


    	$idVenta = $ventaObj->insertVenta($arrVentas);
    	if($idVenta){
    		foreach ($ventas["productos"] as $prd) {
    			$arrDetalle = array(
    				"id_venta" => $idVenta[0]["id"],
    				"producto" => $prd
    			);
	    		$ventaObj->insertDetalleVenta($arrDetalle);
	    	}

	    	echo json_encode(array("type" => "success" , "message" => "Se han registrado exitosamente los datos de la venta."));
    	}else{
    		echo json_encode(array("type" => "error" , "message" => "No se han podido insertar los datos de la venta"));
    	}
    }

    public function insertProducto(){
    	$data = $_POST["producto"];
    	$productos = new Models\Productos();

    	$res = $productos->insertProducto($data);

    	if($res)
    		echo json_encode(array("type" => "success", "message" => "Se ha registrado exitosamente el producto"));
    	else
    		echo json_encode(array("type" => "error", "message" => "No se ha podido registrar el producto"));
    } 

    public function deleteVenta(){
    	$id = $_POST["id"];
    	$ventaObj = new Models\Ventas();

    	$res = $ventaObj->deleteVenta($id);

    	if($res)
    		echo json_encode(array("type" => "success", "message" => "Se ha registrado exitosamente el producto"));
    	else
    		echo json_encode(array("type" => "error", "message" => "No se ha podido registrar el producto"));
    } 
}
