package com.example.springboot.tests.demo;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// common in integration tests when tests has dependencies between them
@Order(1) // for classes order work I need to set up junit properties at test/resources
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderedByOrderTest {

    @Test
    @Order(1)
    void testC(){
        System.out.println("Running test C");
    }



    @Test
    @Order(2)
    void testD(){
        System.out.println("Running test D");
    }


    @Test
    @Order(3)
    void testA(){
        System.out.println("Running test A");
    }

    @Test
    @Order(4)
    void testB(){
        System.out.println("Running test B");
    }
}
