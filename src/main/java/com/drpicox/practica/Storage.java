package com.drpicox.practica;

import java.util.Map;

public class Storage {

    Map<Product, Integer> stock;

    public Storage(Map<Product, Integer> stock) {
        this.stock = stock;
    }

    public int getProductStock(Product product){
        if (stock.containsKey(product)){
            return stock.get(product);
        }
        return 0;
    }

    public void sendProductsToShop(Product product, int amount){
        int productStock = getProductStock(product);
        if(amount <= productStock) {
            stock.replace(product, getProductStock(product) - amount);
        }
    }

}
