package com.example.springboot.tests.demo;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
@Order(2)
@TestMethodOrder(MethodOrderer.Random.class)
public class MethodOrderedRandonlyTest {

    @Test
    void testA(){
        System.out.println("Running test A");
    }

    @Test
    void testB(){
        System.out.println("Running test B");
    }

    @Test
    void testC(){
        System.out.println("Running test C");
    }

    @Test
    void testD(){
        System.out.println("Running test D");
    }
}
