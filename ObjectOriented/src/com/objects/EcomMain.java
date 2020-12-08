package com.objects;

public class EcomMain {
    public static void main(String[] args) {

        var cart = new EcomCart();
        cart.cartAdd(1000);
        cart.setNumberOfItems(1);   //setter
        cart.getNumberOfItems();   //getter
        cart.discount();



    }
}
