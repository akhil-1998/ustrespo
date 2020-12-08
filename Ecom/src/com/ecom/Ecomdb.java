package com.ecom;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Ecomdb {
    public void show() {

        List<Ecom> list = List.of(
                new Ecom("JBL Infinity", "JBL", 1000, 5, Type.WIRELESS),
                new Ecom("boAt BassHead", "boAt", 750, 3, Type.WIRED),
                new Ecom("Realme buds 2", "Realme", 1500, 4, Type.WIRELESS),
                new Ecom("Cosmic Byte GS410", "Cosmic Byte", 1900, 4, Type.WIRED)

        );

        //List out Items
        System.out.println("\n-------------------------------------------------------------------");
        list.forEach(m-> System.out.println("Title: " + m.getTitle()+ "\t\tBrand: " + m.getBrand()+ "\t\tPrice: " + m.getPrice()+ "\t\tRating: " + m.getRating()));
        System.out.println("\n-------------------------------------------------------------------");


        //Seperate on Rating

        Predicate<Ecom> isPopular = m -> m.getRating() > 2;
        System.out.println("\n-----------------");
        System.out.println("Filtered by Rating");
        System.out.println("-------------------");
        list.stream()
                .sorted(Comparator.comparing(Ecom::getRating).reversed())
                .forEach(m-> System.out.println(m.getTitle() + " - Rating " + m.getRating()));
        System.out.println("---------------------------");

        //Low to high price

        System.out.println("\n------------------");
        System.out.println("Price Low to High");
        System.out.println("-------------------");
        list.stream()
                .sorted(Comparator.comparing(m -> m.getPrice()))
                .forEach(m -> System.out.println(m.getTitle() + " Price- " + m.getPrice()));
        System.out.println("---------------------------");

        //High to Low price

        System.out.println("\n------------------");
        System.out.println("Price High to Low");
        System.out.println("-------------------");
        list.stream()
                //.sorted(Comparator.comparing(m -> m.getPrice()).reversed())
                .sorted(Comparator.comparing(Ecom::getPrice).reversed())
                .forEach(m -> System.out.println(m.getTitle() + " Price- " + m.getPrice()));
        System.out.println("---------------------------");
    }


}
