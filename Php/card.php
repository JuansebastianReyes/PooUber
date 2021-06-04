<?php

require_once("payment.php");

class Card extends Payment{
    public $cardNumber;
    public $ccv;
    public $dateCard;

    public function __construct($id,$cardNumber,$ccv,$dateCard){
        parent::__construct($id);
        $this->cardNumber = $cardNumber;
        $this->ccv = $ccv;
        $this->dateCard = $dateCard;

    }
}

?>