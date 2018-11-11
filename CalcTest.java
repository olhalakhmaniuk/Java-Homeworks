package com.company;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    Calc calc=new Calc();





    @org.junit.jupiter.api.BeforeEach
    void setUp()throws Exception {
        System.out.println("Before class");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown()throws Exception {
        System.out.println("After class");
    }

    @org.junit.jupiter.api.Test
    void add() {
        assertTrue(calc.Add(2,7)==9);
    }

    @org.junit.jupiter.api.Test
    void vid() {
    }

    @org.junit.jupiter.api.Test
    void devide() {
        assertEquals(calc.Devide(9,2),4);
    }

    @org.junit.jupiter.api.Test
     void devideZero()throws Exception {
        assertEquals(calc.Devide(9,0),4);
    }

    @org.junit.jupiter.api.Test

    void myltiply() {
    }

}