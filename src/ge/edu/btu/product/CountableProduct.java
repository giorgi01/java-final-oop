package ge.edu.btu.product;

public class CountableProduct extends Product {

    private int quantity;

    public CountableProduct() {}

    public CountableProduct(String name, int calories, int quantity) {
        super(name, calories);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int getCaloriesOverall(){
        return getCalories() * getQuantity();
    }
}
