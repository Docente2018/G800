<?php

namespace App\Models;

use PDO;

class Clientes extends \Core\Model
{
    public static function getAllCustomers()
    {
        $db = static::getDB();
        $stmt = $db->query('SELECT * FROM clientes');
        return $stmt->fetchAll(PDO::FETCH_ASSOC);
    }

    public static function insertCustomer($customer)
    {
        $db = static::getDB();
        $stmt = $db->prepare('INSERT INTO clientes VALUES( null , :tipo_doc , :documento, :nombre, :telefono)');
        $stmt->bindParam(":tipo_doc", $customer["tipo_doc"]);
        $stmt->bindParam(":documento", $customer["documento"]);
        $stmt->bindParam(":nombre", $customer["nombre"]);
        $stmt->bindParam(":telefono", $customer["telefono"]);


        return $stmt->execute();
    }
}
