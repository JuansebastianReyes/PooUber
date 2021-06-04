<?php

require_once("car.php");

class UberVan extends Car{
    public $typeCarAcepted;
    public $seatsMaterial;

    public function __construct($license, Account $driver, $typeCarAcepted, $seatsMaterial){
        parent::__construct($license, $driver);
        $this->typeCarAcepted = $typeCarAcepted;
        $this->seatsMaterial = $seatsMaterial;
    }

    public function setPassenger($passenger) {
    
        if ($passenger == 6) {
            $this->passenger = $passenger;
        }
        else {
            echo "Necesitas asignar 6 pasajeros";
        }
    
    }
        
}
?>