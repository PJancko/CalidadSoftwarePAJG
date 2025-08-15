package verificadorpalindromo;
import org.junit.Test;
import static org.junit.Assert.*;
public class PalindromoTest {
 @Test
 public void testEsPalindromoConPalabraSimple() {
 assertTrue(Palindromo.esPalindromo("reconocer"));
 }
 @Test
 public void testNoEsPalindromo() {
 // Se espera que "hola" no sea un palíndromo
 assertFalse(Palindromo.esPalindromo("hola"));
 }
 @Test
 public void testEsPalindromoConFrase() {
 // Se espera que la frase sea un palíndromo ignorando espacios y puntuación
 assertTrue(Palindromo.esPalindromo("anita lava la tina"));
 }
 @Test
 public void testEsPalindromoConMayusculasYPuntuacion() {
 // Se espera que la frase con mayúsculas y signos de puntuación sea un palíndromo
 assertTrue(Palindromo.esPalindromo("A man, a plan, a canal: Panama"));
 }
 @Test
 public void testEsPalindromoConFraseVacia() {
 // La cadena vacía se considera un palíndromo
 assertTrue(Palindromo.esPalindromo(""));
 }
}