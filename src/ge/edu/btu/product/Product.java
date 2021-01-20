package ge.edu.btu.product;

public abstract class Product {

    private String name;

    private int calories;

    public Product() {}

    public Product(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getCaloriesOverall(){
        return this.calories;
    }
}
