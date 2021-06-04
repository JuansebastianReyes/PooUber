
function Main(){
    var car = new Car("ARS123", new Account("Juan Reyes","ASDA1241"));
    car.passenger = 4;
    car.printDataCar()

    var uberX = new UberX("AW456", new Account("Andrea Ferran", "ANDA765"), "Chevrolet", "Spark")
    uberX.passenger = 4;
    uberX.printDataCar();
}

Main();