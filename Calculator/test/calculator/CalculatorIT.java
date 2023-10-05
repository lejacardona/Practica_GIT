/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aleja
 */
public class CalculatorIT {
    
    public CalculatorIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Calculator.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Calculator.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sumar method, of class Calculator.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int num1 = 0;
        int num2 = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.sumar(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class Calculator.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        int num1 = 0;
        int num2 = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.restar(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class Calculator.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int num1 = 0;
        int num2 = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.multiplicar(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class Calculator.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        int num1 = 0;
        int num2 = 0;
        Calculator instance = new Calculator();
        double expResult = 0.0;
        double result = instance.dividir(num1, num2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
