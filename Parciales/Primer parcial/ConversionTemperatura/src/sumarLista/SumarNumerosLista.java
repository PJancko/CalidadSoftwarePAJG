/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sumarLista;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author janck
 */
public class SumarNumerosLista {
    public static int sumar(List<Integer> numeros) {
        int suma = 0;
        for(int n : numeros){
            suma += n;
        }
        return suma;
    }
}
