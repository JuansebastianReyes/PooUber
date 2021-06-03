class Car{
    constructor(licence, driver){
        this.id;
        this.license = licence;
        this.driver = driver;
        this.passenger;
    }
    printDataCar = () =>{
        console.log(this.driver);
        console.log(this.driver.name);
        console.log(this.driver.document);
    }
}

/* Como se declaraba antes Objetos en Js
function Car(licence, driver){
    this.id;
    this.license = licence;
    this.driver = driver;
    this.passenger;
}

Car.prototype.printDataCar = function(){
        console.log(this.driver);
        console.log(this.driver.name);
        console.log(this.driver.document);
}
*/