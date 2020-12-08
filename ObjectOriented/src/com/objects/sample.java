//package com.objects;
//
//public class sample {
//    public int numberOfItem = 0;
//    public float price;
//
//    public EcomCart(float price) {
//        setPrice(price);
//        numberOfItem ++;
//
//    }
//
//    public void setPrice(float price){
//        this.price = price;
//
//    }
//
//    public static void removeItem(){
//        if(this.numberOfItem == 0) {
//            System.out.println("Cart is empty");
//        }else
//        {
//            this.numberOfItem - 1;
//        }
//
//    }
//
//    public int getNumberOfItem() {
//        return numberOfItem;
//    }
//
//    public void setNumberOfItem(int numberOfItem) {
//        this.numberOfItem = numberOfItem;
//    }
//
//    public  float calTotal(int discount, int numberOfItem){
//        float total = price;
//        float temp = total;
//        float temp1 = 0;
//        if(total > 1500){
//            System.out.println("Congrats you are eligible for 10% discount");
//            temp = price / 100;
//            temp1 = price - temp;
//            return temp1;
//        }else
//        {
//            System.out.println("Your Cart amount=" + price);
//        }
//
//
//        return 0;
//    }
//}
