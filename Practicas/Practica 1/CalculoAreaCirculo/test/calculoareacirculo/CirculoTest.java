package calculoareacirculo;

import org.junit.Test;
import static org.junit.Assert.*;

public class CirculoTest {

    @Test
    public void testAreaRadioPositivo() {
        assertEquals(78.5398, Circulo.calcularArea(5), 0.0001);
    }

    @Test
    public void testAreaRadioCero() {
        assertEquals(0, Circulo.calcularArea(0), 0.0001);
    }

    @Test
    public void testAreaRadioNegativo() {
        assertEquals(0, Circulo.calcularArea(-3), 0.0001);
    }

    @Test
    public void testAreaRadioGrande() {
        assertEquals(3141592.6535, Circulo.calcularArea(1000), 0.0001);
    }

    @Test
    public void testAreaRadioDecimal() {
        assertEquals(38.4845, Circulo.calcularArea(3.5), 0.0001);
    }
}
