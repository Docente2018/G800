<?php

namespace App\Models;

use PDO;

class Ventas extends \Core\Model
{
    public static function getAll()
    {
        $db = static::getDB();
        $stmt = $db->query('SELECT a.*, b.nombre_completo FROM ventas a INNER JOIN clientes b ON a.cliente_id = b.id');
        return $stmt->fetchAll(PDO::FETCH_ASSOC);
    }


    public static function insertVenta($data){
        $db = static::getDB();
        $stmt = $db->prepare("INSERT INTO ventas VALUES( null , :valor, NOW(), :cliente_id, :cantidad_productos, :desc_venta)");
        
        $stmt->bindValue(":valor", $data["valor"]);
        $stmt->bindValue(":cliente_id", $data["cliente_id"]);
        $stmt->bindValue(":cantidad_productos", $data["cantidad_productos"]);
        $stmt->bindValue(":desc_venta", $data["desc_venta"]);

        if($stmt->execute()){
            $query = $db->query("SELECT MAX(id) as id FROM ventas");
            return $query->fetchAll(PDO::FETCH_ASSOC);
        }

        return false;
    }

    public static function insertDetalleVenta($data){
        $db = static::getDB();
        $stmt = $db->prepare("INSERT INTO detalle_venta VALUES( null , :id_venta, :producto)");
        
        $stmt->bindValue(":id_venta", $data["id_venta"]);
        $stmt->bindValue(":producto", $data["producto"]);

        return $stmt->execute();
    }

    public static function deleteVenta($id){
        $db = static::getDB();

        $stmt = $db->prepare("delete from ventas where id = :id");        
        $stmt->bindValue(":id", $id);

        $stmt->execute();

        $stmt2 = $db->prepare("delete from detalle_venta where id_venta = :id");        
        $stmt2->bindValue(":id", $id);

        return $stmt2->execute();
    } 
}
