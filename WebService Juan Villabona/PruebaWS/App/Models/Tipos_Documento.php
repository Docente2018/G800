<?php

namespace App\Models;

use PDO;

/**
 * Example user model
 *
 * PHP version 7.0
 */
class Tipos_Documento extends \Core\Model
{

    /**
     * Get all the users as an associative array
     *
     * @return array
     */
    public static function getAllTypes()
    {
        $db = static::getDB();
        $stmt = $db->query('SELECT * FROM tipos_documento');
        return $stmt->fetchAll(PDO::FETCH_ASSOC);
    }
}
