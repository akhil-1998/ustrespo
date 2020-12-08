package com.objects;

public class EcomCart {         //default constructor

    private int numberOfItems;
    private int price;

    public EcomCart(){

        System.out.println("Number of Item in cart Initially:" + numberOfItems);
    }

    public void cartAdd(
            int Price){

        System.out.println("Adding Item to Cart");
        this.price = Price;
        numberOfItems ++;
        System.out.println("Number of item now in cart is: " + numberOfItems);
        System.out.println("Price of item " + price);

    }


    public int getNumberOfItems() {         //getter

        return numberOfItems;
    }

    public void setNumberOfItems(           //setter
            int numberOfItems) {

        this.numberOfItems = numberOfItems;
        System.out.println("Number of items in cart after setNum is: " + numberOfItems);

        price = numberOfItems * 1000;
        System.out.println("Price after adding to cart is: " + price);
    }

    public void discount(){

        if(price > 1500){
            System.out.println("You are eligible for 10% Discount of your cart value");
            System.out.println("Initial Cart value is " + price);

            int temp = price;
            temp = price / 10;
            int total = price - temp;
            System.out.println("Discount Amount= " + total);
        }
        else {
            System.out.println("You are not eligible for any discount! Keep Shopping with as");
        }
    }
}
