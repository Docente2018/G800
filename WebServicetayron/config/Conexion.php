<?php
//Clase encargada de laconexion con la base de datos
class Conexion {

    private static $instance = null;

    private function __construct() {
        
    }
//Patron de diseño singleton
    public static function singleton() {
        if (self::$instance == null) {
            self::$instance = new Conexion();
        }
        return self::$instance;
    }
//Se conecta con la base de datos
    public function obtenerConexion() {
        $conn = null;

        try {
            $conn = new PDO("mysql:host=localhost;dbname=aerolinea", "root", "");
            $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
        }
        catch (PDOException $e) {
            echo 'ERROR: ' . $e->getMessage();
            die();
        }

        return $conn;
    }

    // Evita que el objeto se pueda clonar
    public function __clone() {
        trigger_error('La clonación de este objeto no está permitida', E_USER_ERROR);
    }

}
