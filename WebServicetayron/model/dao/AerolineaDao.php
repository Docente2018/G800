<?php

class AerolineaDao {
//Metodo de registro de aerolineas
    public function registrarAerolinea(AerolineaDto $aer) {
       //Se Obtiene la conexion 
        $conn = Conexion::singleton()->obtenerConexion();

        $mensaje = "";
        try {

            $id = $aer->getId();
            $aerolinea = $aer->getAerolinea();
            //Se valida el Id que no exista en la base de datos
            $consult = $conn->prepare("SELECT * FROM tbl_aerolinea  WHERE id=?");
            $consult->bindParam(1, $id);
            $consult->execute();
            $row = $consult->rowCount();
            //Retorna el mensaje de que existe el registro y finaliza
            if ($row > 0) {
                $mensaje = "Este registro ya esta  en base de datos";
            }
            else {
            //Registra la aerolinea
                $query = $conn->prepare("INSERT INTO tbl_aerolinea VALUES(?,?)");
                $query->bindParam(1, $id);
                $query->bindParam(2, $aerolinea);
               
                $query->execute();
                $cuenta = $query->rowCount();
                //Mensaje de exito
                if ($cuenta > 0) {
                    $mensaje = "Aerolinea registrada en base de datos" . $cuenta;
                }
                else {
                    //Mensaje de error
                    $mensaje = "No se pudo ingresar el registro";
                }
            }
        }
        catch (Exception $ex) {

            $mensaje = $ex->getMessage();
        }

//Se retorna el mensaje
        return $mensaje;
    }
//Metodo para la actualizacion de datos
    public function modificarAerolinea(AerolineaDto $aer) {
        $id = $aer->getId();
        $aerolinea = $aer->getAerolinea();
        //Se obtiene la conexion
        $conn = Conexion::singleton()->obtenerConexion();

        $mensaje = "";
        try {
            //Consulta de actualizacion de datos
            $query = $conn->prepare("UPDATE tbl_aerolinea SET aerolinea=? where id=?");
            $query->bindParam(1, $aerolinea, PDO::PARAM_STR);
            $query->bindParam(2, $id, PDO::PARAM_INT);
            $query->execute();
            $mensaje = "Aerolinea Actualizada";
        }
        catch (Exception $ex) {

            $mensaje = $ex->getMessage();
        }

        $conn = null;
        return $mensaje;
    }
//Metodo para la eliminacion de datos
    public function eliminarAerolinea($idaero) {
//Se obtiene la conexion
        $conn = Conexion::obtenerConexion();

        $mensaje = "";
        try {
            //Consulta para la eliminacion de datos
            $query = $conn->prepare("DELETE FROM tbl_aerolinea where id=?");
            $query->bindParam(1, $idaero);

            $query->execute();
            $mensaje = "Registro eliminado";
        }
        catch (Exception $ex) {

            $mensaje = $ex->getMessage();
        }

        $conn = null;
        return $mensaje;
    }
//Metodo para listar las aerolines registradas
    public function listarAerolineas() {
//Se obtiene la conexion
        $conn = Conexion::singleton()->obtenerConexion();
        try {
            //Consulta para listar las aerolinas registradas
            $query = $conn->prepare("SELECT * FROM tbl_aerolinea");
            $query->execute();
            return $query->fetchAll();
        }
        catch (Exception $ex) {

            echo 'ERROR' . $ex->getMessage();
        }

        $conn = null;
    }
//Metodo para obtener una aerolinea por Id
    public function listarUno($idAero) {
        $id = $idAero;
        //Se obtiene la conexion
        $conn = Conexion::singleton()->obtenerConexion();
       try {
           //Consulta para obtener la aerolinea por id
            $query = $conn->prepare("SELECT * FROM tbl_aerolinea WHERE id=?");
            $query->bindParam(1, $id);
            $query->execute();
            return $query->fetch();
        }
        catch (Exception $ex) {

            echo 'Error' . $ex->getMessage();
        }

        $conn = null;
    }

}
