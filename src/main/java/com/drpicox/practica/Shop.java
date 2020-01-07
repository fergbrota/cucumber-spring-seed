package com.drpicox.practica;

import java.util.HashMap;
import java.util.Map;

public class Shop {

    Map<Product, Integer> products;

    Shop(){
        products = new HashMap<Product, Integer>();
    }

    Shop(Map<Product, Integer> products) {
        this.products = products;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public int getProductAvailability(Product product){
        if (products.containsKey(product)){
            return products.get(product);
        }
        return 0;
    }

    public void sellProduct(Product product){
        int productAvailability = getProductAvailability(product);
        if (productAvailability > 0){
            products.replace(product, productAvailability-1);
        }
    }

    public void restockProduct(Product product, int amount, Storage storage) throws Exception{
        products.replace(product, getProductAvailability(product) + amount);
        storage.sendProductsToShop(product, amount);
    }


}
