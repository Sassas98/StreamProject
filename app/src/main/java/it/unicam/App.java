package it.unicam;

import java.util.stream.Stream;

public class App {

    
    public static void main(String[] args) {
        Stream.iterate(0, n -> n + 1).limit(20).forEach(System.out::println);
    }
}