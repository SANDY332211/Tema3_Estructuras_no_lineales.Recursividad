/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema3_Estructuras_no_lineales.Recursividad;

import java.util.Arrays;

/**
 *
 * @author vanesahonorato
 */
public class ReverseArrayTest {
 public static void main(String[] args) {
        
        int[] data1 = {1, 2, 3, 4, 5};
        System.out.println("EJEMPLO 1 Arreglo original: ");
        imprimirArray(data1);
        ReverseArray.reverseArray(data1, 0, data1.length - 1);
        System.out.println("EJEMPLO 1 Arreglo invertido: ");
        imprimirArray(data1);
        System.out.println("\n");

      
        int[] data2 = {10, 20, 30, 40};
        System.out.println("EJEMPLO 2 Arreglo original: ");
        imprimirArray(data2);
        ReverseArray.reverseArray(data2, 0, data2.length - 1);
        System.out.println("EJEMPLO 2 Arreglo invertido:");
        imprimirArray(data2);
        System.out.println("\n");


        
        int[] data3 = {7,6,5,4,3,2,1};
        System.out.println("EJEMPLO 3 Arreglo original: ");
        imprimirArray(data3);
        ReverseArray.reverseArray(data3, 0, data3.length - 1);
        System.out.println("EJEMPLO 3 Arreglo invertido: ");
        imprimirArray(data3);
        System.out.println("\n");

    }

   
    public static void imprimirArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}