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
        
}
?>