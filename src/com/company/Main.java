package com.company;

public class Main {

    public static void main(String[] args) {
        Box<Integer,String> box = new Box<>(10,"brown");
        System.out.println(Box.method(box));
    }
}
