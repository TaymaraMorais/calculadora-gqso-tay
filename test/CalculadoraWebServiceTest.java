/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraapi;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Taymara
 */
public class CalculadoraWebServiceTest {
    
    public CalculadoraWebServiceTest() {
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
     * Test of getSoma method, of class CalculadoraWebService.
     */
    @Test
    public void testGetSoma() {
        System.out.println("getSoma");
        double valor1 = 0.0;
        double valor2 = 0.0;
        CalculadoraWebService instance = new CalculadoraWebService();
        double expResult = 0.0;
        double result = instance.getSoma(valor1, valor2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
