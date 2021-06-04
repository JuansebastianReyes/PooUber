<?php
require_once('account.php');
require_once('car.php');
require_once('uberVan.php');
require_once('uberX.php');

echo "Programacion Orientado a Objetos ";

$uberVan = new UberVan("OJL395", new Account("Raúl Ramírez", "AND456"), "Nissan", "Versa");
$uberVan->setPassenger(6);
$uberVan->printDataCar();

$uberX = new UberX("CVB123", new Account("Andres Herrera", "AND456"), "Chevrolet", "Spark");
$uberX->setPassenger(4);
$uberX->printDataCar();

?>