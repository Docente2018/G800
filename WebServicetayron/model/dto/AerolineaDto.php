<?php
//Modelo para persistencia de la Aerolinea
class AerolineaDto{
    //Atributos
    private $id;
    private $aerolinea;
  
    
    function __construct() {
        
    }
    function getId() {
        return $this->id;
    }

    function getAerolinea() {
        return $this->aerolinea;
    }

    function setId($id) {
        $this->id = $id;
    }

    function setAerolinea($aerolinea) {
        $this->aerolinea = $aerolinea;
    }


    

    
}