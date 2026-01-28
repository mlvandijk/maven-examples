package com.acme.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {
    private static final Logger LOG = LoggerFactory.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        String name = "world";
        if (args != null && args.length > 0) name = args[0];
        LOG.info("Hello " + name);
    }
}
