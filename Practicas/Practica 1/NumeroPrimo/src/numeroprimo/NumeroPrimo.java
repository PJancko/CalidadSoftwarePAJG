package numeroprimo;

public class NumeroPrimo {

public static boolean esPrimo(int numero) {
    if (numero <= 1) return false;
    int limite = (int) Math.sqrt(numero);
    for (int divisor = 2; divisor <= limite; divisor++) {
        if (numero % divisor == 0) {
            return false;
        }
    }
    return true;
}
}
