public class UsedCar extends Car {

    private int mileage;

    // constructor
    public UsedCar(String model, double price) {
        super(model, price);
    }

    // get & set
    protected int getMileage() {
        return mileage;
    }

    protected void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getPrice() {
        double newprice = price;

        //price = price * 0.099995 * mileage;
        //price = price / 100 * 0.005; 
        //price = price * mileage;
        
        double pri = (price / 100 * 0.0005) * mileage;
        
        price = price - pri;
        
        return price;
        
    }

}