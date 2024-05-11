package AmazonImplementation;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String productName;
    private int price;

    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

//    create a getter and setter for both parameterts
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

//    create a loop list of products to run through
    public List<String> getProductList(){
        //create a new array and add products into it
        List<String> productList = new ArrayList<String>();
        productList.add("Apple Macbook Pro");
        productList.add("Apple Macbook Air");
        productList.add("iPhone");
        return productList;
    }

}
