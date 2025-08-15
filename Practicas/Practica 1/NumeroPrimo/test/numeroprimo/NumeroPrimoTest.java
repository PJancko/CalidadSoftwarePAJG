package numeroprimo;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumeroPrimoTest {

    @Test
    public void testNumeroPrimo() {
        assertTrue(NumeroPrimo.esPrimo(7));
    }

    @Test
    public void testNumeroNoPrimo() {
        assertFalse(NumeroPrimo.esPrimo(6));
    }

    @Test
    public void testNumeroNegativo() {
        assertFalse(NumeroPrimo.esPrimo(-3));
    }

    @Test
    public void testNumeroGrande() {
        assertTrue(NumeroPrimo.esPrimo(997));
    }

    @Test
    public void testNumeroCero() {
        assertFalse(NumeroPrimo.esPrimo(0));
    }
}
