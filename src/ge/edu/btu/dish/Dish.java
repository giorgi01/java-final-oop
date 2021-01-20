package ge.edu.btu.dish;

import java.util.ArrayList;

import ge.edu.btu.product.Product;

public class Dish {

    private String name;

    private ArrayList<Product> products = new ArrayList<Product>();

    public Dish() {};

    public Dish(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public int getTotalCalories(){
        int total = 0;
        for (int i = 0; i < getProducts().size(); i++) {
            total += getProducts().get(i).getCaloriesOverall();
        }
        return total;
    }
}
