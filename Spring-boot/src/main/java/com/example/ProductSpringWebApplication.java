package com.example;

import java.util.List;

public class ProductSpringWebApplication {
    public static void main(String[] args) {
//        System.out.println(product);
        ProductService service =new ProductService();
        service.addProduct(new Product("Kalpana","BLR", "Female",2));
        service.addProduct(new Product("laptop", "electronics", "Bangalore", 50));
        service.addProduct(new Product("fridge", "appliance", "Chennai", 36));
        service.addProduct(new Product("sofa", "furniture", "Delhi", 60));
        service.addProduct(new Product("microwave", "appliance", "Mumbai", 24));
        service.addProduct(new Product("TV", "electronics", "Hyderabad", 48));
        service.addProduct(new Product("fan", "appliance", "Kolkata", 18));
        service.addProduct(new Product("bed", "furniture", "Pune", 72));
        service.addProduct(new Product("washing machine", "appliance", "Ahmedabad", 30));
        service.addProduct(new Product("tablet", "electronics", "Noida", 12));
        service.addProduct(new Product("chair", "furniture", "Jaipur", 36));
        List<Product>pList =service.getAllProducts();

        for (Product p :pList){
            System.out.println(p);
        }
        System.out.println("================================");
        Product productGet = service.getProduct("Kalpana");
        System.out.println(productGet);
        System.out.println("================================");
//
//        List<Product> prod = service.getProductByText("ap");
//        for (Product p :prod){
//            System.out.println(p);
//        }


    }
}
