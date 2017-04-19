package com.company;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {

    static {
        PropertyConfigurator.configure("log4j.properties");
    }
    public static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        System.out.println("asdf");
    }
}
