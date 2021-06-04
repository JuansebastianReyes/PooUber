<?php
require_once('account.php');
require_once('car.php');
require_once('uberX.php');
require_once('uberPool.php');

echo "Programacion Orientado a Objetos ";

$car = new Car("ARS123", new Account("Juan Reyes","ASDA1241"));
$car->printDataCar();

$uberX = new UberX("LHL231", new Account("Juan Reyes", "JSR121"), "Chevrolet", "Spark");
$uberX -> printDataCar();

$uberPool = new UberX("LJU192", new Account("Andres Lopez", "ANL123"), "Chevrolet", "Spark");
$uberPool -> printDataCar();

?>