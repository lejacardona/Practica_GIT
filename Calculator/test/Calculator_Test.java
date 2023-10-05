/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import calculator.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author aleja
 */
public class Calculator_Test {

    public Calculator_Test() {
    }
    Calculator calculadora = new Calculator(4, 2);
    
    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void test_calculator() {
        assertEquals(6, calculadora.sumar(4, 2));
        assertEquals(2, calculadora.restar(4, 2));
        assertEquals(8, calculadora.multiplicar(4, 2));
        assertEquals(2, calculadora.dividir(4, 2));
    }
}
