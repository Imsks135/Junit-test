package cgi;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
    public void testAdd() {
        Calculator obj = new Calculator();
        int result = obj.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    public void testSubtract() {
        Calculator obj = new Calculator();
        int result = obj.subtract(8, 3);
        assertEquals(5, result);
    }

    @Test
    public void testMultiply() {
    	Calculator obj = new Calculator();
    	int result = obj.multiply(2,3);
    	assertEquals(6,result);
    }
    @Test
    public void testDivide() {
    	Calculator obj = new Calculator();
    	int result = obj.divide(10,2);
    	assertEquals(5,result);
    }
}
