<?php
//Se añaden los archivos necesarios para el CRUD De aerolineas
require_once '../config/Conexion.php';
require_once '../model/dao/AerolineaDao.php';
require_once '../model/dto/AerolineaDto.php';


//Registro De areolineas
if (isset($_POST['registrar'])) {
//Clase de Persistencia de datos
    $AeroDao = new AerolineaDao();
    //Clase de Modelo de datos
    $AeroDto = new AerolineaDto();

    $AeroDto->setId($_POST['id']);
    $AeroDto->setAerolinea($_POST['aerolineaNombre']);
   //LLamado del metodo de registro de Areolineas
    $mensaje = $AeroDao->registrarAerolinea($AeroDto);
//Se retorna mensaje
    header("Location: ../index.php?mensaje=" . $mensaje);
}
//Actualizacion de datos de areolinas
if (isset($_POST['modificar'])) {

    $AeroDao = new AerolineaDao();
    $AeroDto = new AerolineaDto();
    $AeroDto->setId($_POST['id']);
    $AeroDto->setAerolinea($_POST['aerolinea']);
    //Llamando al metodo de la clase de persistencia para actulizacion de la aerolinea
    $mensaje = $AeroDao->modificarAerolinea($AeroDto);
    header("Location: ../Registros.php?mensaje=" . $mensaje);
}
//Eliminacion de aerolineas
if (isset($_GET['id'])) {
    $AeroDao = new AerolineaDao();
    //Llamado al metodo de la clase de persistencia para la eliminacion de la aerolinea
    $mensaje = $AeroDao->eliminarAerolinea($_GET['id']);
    header("Location: ../Registros.php?mensaje=" . $mensaje);
}






    