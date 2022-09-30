public class Tester {

    public static void main(String[] args) {
        
        UsedCar car = new UsedCar("Auto 1", 300);
        car.setMileage(20);
        
        System.out.println(car.getPrice());

    }

}