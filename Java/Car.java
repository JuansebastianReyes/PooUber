package Java;

public class Car {
    private Integer id;
    private String licence;
    private Account driver;
    private Integer passegenger;

    public Car(String licence, Account driver){
        this.licence = licence;
        this.driver = driver;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicence(){
        return licence;
    }

    public void SerLicence(String licence){
        this.licence = licence;
    }
    
    public Account getDriver(){
        return driver;
    }

    public void setDriver(Account driver){
        this.driver = driver;
    }

    public Integer getPassegenger() {
        return passegenger;
    }

    public void setPassegenger(Integer passegenger){
        if(passegenger == 4){
            this.passegenger = passegenger;
        }else{
            System.out.println("Necesitamos asignar 4 pasajeros");
        }
    }

    void printDataCar(){
        System.out.println("Licence: " + licence + " Name Driver: " + driver.name + " passegenger: "+ passegenger);
    }
}
