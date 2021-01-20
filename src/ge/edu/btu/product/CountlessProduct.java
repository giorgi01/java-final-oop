package ge.edu.btu.product;

public class CountlessProduct extends Product {

    private int mass; // in grams

    public CountlessProduct() {}

    public CountlessProduct(String name, int calories, int mass) {
        super(name, calories);
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    @Override
    public int getCaloriesOverall(){
        return getCalories() * (getMass() / 10);
    }
}
