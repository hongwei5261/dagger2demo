package com.dagger2.demo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hongwei on 2017/7/9.
 */
public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }


    @Test
    public void sum() throws Exception {
        assertEquals(calculator.sum(1, 2), 3);
    }

}