package com.drpicox.practica;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;


public class PracticaTest {

    Map<Product, Integer> products = new HashMap<>();
    Clothing shirt = new Clothing(1, "polyester", "red", 30);

    @Test
    public void buyAPieceOfClothing(){
        products.put(shirt, 5);
        Shop shop = new Shop(products);
        shop.sellProduct(shirt);

        assertEquals(4, shop.getProductAvailability(shirt));
    }
}
