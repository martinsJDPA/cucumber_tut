package AmazonImplementation;

public class Search {
    public String displayProduct(Product product){

        //loop through productList to compare each product
        if(product.getProductList().contains(product.getProductName())){
            return product.getProductName();
        }
        return null;
    }
}
