package ge.edu.btu;

import ge.edu.btu.dish.Dish;
import ge.edu.btu.product.CountableProduct;
import ge.edu.btu.product.CountlessProduct;
import ge.edu.btu.product.Product;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<Product>();

        Product firstProduct = new CountableProduct("first product", 200, 4);
        Product secondProduct = new CountlessProduct("second product", 80, 20);

        products.add(firstProduct);
        products.add(secondProduct);

        Dish someDish = new Dish("dish name", products);

        System.out.println(someDish.getTotalCalories());
    }
}
