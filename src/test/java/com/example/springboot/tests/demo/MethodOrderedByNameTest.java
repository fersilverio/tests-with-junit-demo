package com.example.springboot.tests.demo;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class) // by name is default, but this example is for how to do it explicitly
public class MethodOrderedByNameTest {

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
