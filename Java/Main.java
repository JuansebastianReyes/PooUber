package Java;

class Main {
    
    public static void main(String[] args) {
        System.out.println("Hola mindo");

        UberX uberX = new UberX("ACB123", new Account("Juan Reyes", "sfas123"),"Chevrolet","Sonic");
        uberX.setPassegenger(3);
        uberX.printDataCar();

        /*Car car2 = new Car("AVB123", new Account("Carlos Romero", "casa312"));
        car2.passegenger = 4;
        car2.printDataCar();*/
    }
}