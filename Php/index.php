<?php
require_once 'account.php';
require_once 'car.php';

echo "Programacion Orientado a Objetos";

$car = new Car("ARS123", new Account("Juan Reyes","ASDA1241"));
$car->printDataCar();