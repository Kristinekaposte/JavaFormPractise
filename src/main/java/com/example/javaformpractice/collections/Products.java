package com.example.javaformpractice.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Products extends Users {
    private Double price;
    private String productsName;
    List<Products> myProducts;

    public Products () {
    }
    public  Products(String productsName, Double price){
        this.productsName= productsName;
        this.price=price;
    }

    public Double getPrice() {
        return this.price;
    }
    public String getProductsName() {
        return this.productsName;
    }
    @Override
    public String toString() {
        return this.productsName+" "+this.price;
    }
}
