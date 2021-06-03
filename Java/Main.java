package Java;

class Main {
    
    public static void main(String[] args) {
        System.out.println("Hola mindo");

        Car car = new Car("ACB123", new Account("Juan Reyes", "sfas123"));
        car.passegenger = 3;
        car.printDataCar();

        Car car2 = new Car("AVB123", new Account("Carlos Romero", "casa312"));
        car2.passegenger = 4;
        car2.printDataCar();
    }
}