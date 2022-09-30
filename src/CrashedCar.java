public class CrashedCar extends Car {
    
    private int damageLevel;

    //constructor
    public CrashedCar(String model, double price) {
        super(model, price);
    }
    
    //get & set
    public int getDamageLevel() {
        return damageLevel;
    }
    public void setDamageLevel(int damageLevel) {
        this.damageLevel = damageLevel;
    }

    
    public double getPrice() {
        double newprice = price;
        
        switch(this.damageLevel) {
        case 0:
            price = price * 0.9;
            break;
        case 1:
            price = price * 0.5;
            break;
        case 2:
            price = 0;
            break;
        }
        
        return price;
    }
}