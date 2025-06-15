package com.example;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    ProductDB db = new ProductDB();
    List<Product> products =new ArrayList<>();
    public void addProduct(Product p){
//        products.add(p);
        db.save(p);
    }

    public List<Product> getAllProducts() {

//        return products;
       return  db.getProductsAllDB();
    }

    public Product getProduct(String Name){
//        for (Product p :products){
//            if(p.getName().contentEquals(Name)){
//                return p;
//            }
//        }
//        return null;
        return db.getProductByName(Name);
    }


//    public List<Product> getProductByText(String Text) {
//        List<Product> result =new ArrayList<>();
//
////        for(Product p : products){
////            if(p.getName().contains(Text) || p.getPlace().contains(Text) || p.getType().contains(Text)){
////                result.add(p);
////            }
//
//        }
//        return result;
//    }
}
