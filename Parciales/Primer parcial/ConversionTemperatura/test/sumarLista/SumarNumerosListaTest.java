/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package sumarLista;

import java.util.Arrays;
import java.util.Collections;
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
public class SumarNumerosListaTest {
    
    @Test
    public void testListaPositivos() {
        assertEquals(15, SumarNumerosLista.sumar(Arrays.asList(1, 2, 3, 4, 5)));
    }

    @Test
    public void testListaNegativos() {
        assertEquals(-6, SumarNumerosLista.sumar(Arrays.asList(-1, -2, -3)));
    }

    @Test
    public void testListaVacia() {
        assertEquals(0, SumarNumerosLista.sumar(Collections.emptyList()));
    }

    @Test
    public void testListaMezcla() {
        assertEquals(10, SumarNumerosLista.sumar(Arrays.asList(10, -5, 7, -2)));
    }

    @Test
    public void testListaUnElemento() {
        assertEquals(42, SumarNumerosLista.sumar(Arrays.asList(42)));
    }
    
}
