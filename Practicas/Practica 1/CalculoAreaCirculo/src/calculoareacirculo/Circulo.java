package calculoareacirculo;

public class Circulo {

public static double calcularArea(double radio) {
    if (radio < 0) {
        return 0;
    }
    double area = Math.PI * Math.pow(radio, 2);
    return area;
}

}
