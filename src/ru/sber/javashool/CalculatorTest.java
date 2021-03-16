package ru.sber.javashool;

import static org.junit.Assert.*;

public class CalculatorTest {

    @org.junit.Test
    public void add() {
        assertEquals("The test Calculator.add fail!", 13, Calculator.add(5, 8));
        assertEquals("The test Calculator.add fail!", 1024, Calculator.add(512, 512));
    }

    @org.junit.Test
    public void testAdd() {
        Integer Value1 = 4;
        Integer Value2 = 10;
        Integer Expected = 14;
        assertEquals("The test Calculator.add fail!", Expected.intValue(), Calculator.add(Value1, Value2).intValue());
        Value1 = 10000;
        Value2 = 5000;
        Expected = 15000;
        assertEquals("The test Calculator.add fail!", Expected.intValue(), Calculator.add(Value1, Value2).intValue());
    }

    @org.junit.Test
    public void subtract() {
        assertEquals("The test Calculator.subtract fail!", -3, Calculator.subtract(5, 8));
        assertEquals("The test Calculator.subtract fail!", 256000, Calculator.subtract(512000, 256000));
    }

    @org.junit.Test
    public void testSubtract() {
        Integer Value1 = 4;
        Integer Value2 = 10;
        Integer Expected = -6;
        assertEquals("The test Calculator.subtract fail!", Expected.intValue(), Calculator.subtract(Value1, Value2).intValue());
        Value1 = 10000;
        Value2 = 5000;
        Expected = 5000;
        assertEquals("The test Calculator.subtract fail!", Expected.intValue(), Calculator.subtract(Value1, Value2).intValue());
    }

    @org.junit.Test
    public void multiply() {
        assertEquals("The test Calculator.multiply fail!", 40, Calculator.multiply(5, 8));
        assertEquals("The test Calculator.multiply fail!", 512000, Calculator.multiply(512, 1000));
    }

    @org.junit.Test
    public void testMultiply() {
        Integer Value1 = 4;
        Integer Value2 = 10;
        Integer Expected = 40;
        assertEquals("The test Calculator.multiply fail!", Expected.intValue(), Calculator.multiply(Value1, Value2).intValue());
        Value1 = 10000;
        Value2 = 5;
        Expected = 50000;
        assertEquals("The test Calculator.multiply fail!", Expected.intValue(), Calculator.multiply(Value1, Value2).intValue());
    }

    @org.junit.Test
    public void divide() {
        assertEquals("The test Calculator.divide fail!", 4, Calculator.divide(16, 4));
        assertEquals("The test Calculator.divide fail!", 128, Calculator.divide(1024, 8));
    }

    @org.junit.Test
    public void testDivide() {
        Integer Value1 = 64;
        Integer Value2 = 8;
        Integer Expected = 8;
        assertEquals("The test Calculator.divide fail!", Expected.intValue(), Calculator.divide(Value1, Value2).intValue());
        Value1 = 10000;
        Value2 = 5;
        Expected = 2000;
        assertEquals("The test Calculator.divide fail!", Expected.intValue(), Calculator.divide(Value1, Value2).intValue());
    }

    @org.junit.Test
    public void sqr() {
        assertEquals("The test Calculator.sqr fail!", 64, Calculator.sqr(8));
        assertEquals("The test Calculator.sqr fail!", 65536, Calculator.sqr(256));
    }

    @org.junit.Test
    public void testSqr() {
        Integer Value = 64;
        Integer Expected = 4096;
        assertEquals("The test Calculator.sqr fail!", Expected.intValue(), Calculator.sqr(Value).intValue());
        Value = 1000;
        Expected = 1000000;
        assertEquals("The test Calculator.sqr fail!", Expected.intValue(), Calculator.sqr(Value).intValue());
    }

    @org.junit.Test
    public void sqrt() {
        assertEquals("The test Calculator.sqrt fail!", 8, Calculator.sqrt(64));
        assertEquals("The test Calculator.sqrt fail!", 256, Calculator.sqrt(65536));
    }

    @org.junit.Test
    public void testSqrt() {
        Integer Value = 4096;
        Integer Expected = 64;
        assertEquals("The test Calculator.sqrt fail!", Expected.intValue(), Calculator.sqrt(Value).intValue());
        Value = 1000000;
        Expected = 1000;
        assertEquals("The test Calculator.sqrt fail!", Expected.intValue(), Calculator.sqrt(Value).intValue());
    }

    @org.junit.Test
    public void testSqrt1() {
        assertEquals("The test Calculator.sqrt fail!", 8, Math.round(Calculator.sqrt(64.0)));
        assertEquals("The test Calculator.sqrt fail!", 256, Math.round(Calculator.sqrt(65536.0)));
    }

    @org.junit.Test
    public void testSqrt2() {
        Double Value = 4096.0;
        Integer Expected = 64;
        assertEquals("The test Calculator.sqrt fail!", Expected.intValue(), Math.round(Calculator.sqrt(Value)));
        Value = 1000000.0;
        Expected = 1000;
        assertEquals("The test Calculator.sqrt fail!", Expected.intValue(), Math.round(Calculator.sqrt(Value)));
    }
}