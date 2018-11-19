<?php

namespace App\Models;

use PDO;

class Productos extends \Core\Model
{
    public static function getAll()
    {
        $db = static::getDB();
        $stmt = $db->query('SELECT * FROM producto');
        return $stmt->fetchAll(PDO::FETCH_ASSOC);
    }

    public static function getPriceProducts($id){
        $db = static::getDB();
        $stmt = $db->prepare('SELECT precio FROM producto WHERE id = :id');
        $stmt->bindValue(":id", $id);
        $stmt->execute();
        return $stmt->fetchAll(PDO::FETCH_ASSOC);
    }

    public static function insertProducto($data){
        $db = static::getDB();
        $stmt = $db->prepare('INSERT INTO producto VALUES (null, :nombre, :descripcion, :precio, 0)');

        $stmt->bindValue(":nombre", $data["nombre"]);
        $stmt->bindValue(":descripcion", $data["descripcion"]);
        $stmt->bindValue(":precio", $data["precio"]);

        return $stmt->execute();
    }
}
