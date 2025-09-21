/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package conversiontemperatura;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author janck
 */
public class CelsiusFarenheitTest {
    
    @Test
    public void testCelsiusPositivo() {
        assertEquals(77.0, CelsiusFarenheit.celsiusAFahrenheit(25), 0.001);
    }

    @Test
    public void testCelsiusNegativo() {
        assertEquals(14.0, CelsiusFarenheit.celsiusAFahrenheit(-10), 0.001);
    }

    @Test
    public void testCelsiusCero() {
        assertEquals(32.0, CelsiusFarenheit.celsiusAFahrenheit(0), 0.001);
    }

    @Test
    public void testCelsiusDecimal() {
        assertEquals(97.88, CelsiusFarenheit.celsiusAFahrenheit(36.6), 0.01);
    }

    @Test
    public void testCelsiusGrande() {
        assertEquals(1832.0, CelsiusFarenheit.celsiusAFahrenheit(1000), 0.001);
    }
    
}
