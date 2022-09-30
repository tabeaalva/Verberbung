public abstract class Car {
    
    private String model;
    protected double price;
    
    
    public Car(String model, double price) {
        super();
        this.model = model;
        this.price = price;
    }


    protected abstract double getPrice();


}