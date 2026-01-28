package com.acme.examples;

public class HelloWorld {
    public static void main(String[] args) {
        String name = "world";
        if (args != null && args.length > 0) name = args[0];
        System.out.println("Hello " + name);
    }
}
