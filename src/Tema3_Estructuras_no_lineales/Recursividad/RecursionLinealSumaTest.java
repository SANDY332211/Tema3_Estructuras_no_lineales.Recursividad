
package Tema3_Estructuras_no_lineales.Recursividad;

import Tema3_Estructuras_no_lineales.Recursividad.RecursionLinealSuma;

/**
 *ITESS-TICS AGO-DIC 2024 ESTRUCTURA Y ORGANIZACIÓN DE EDATOS DOCENTE:
 * SANDRA ARACELI HERNANDEZ
 * DESCRIPCCION: PRACTICA DE SUMA RECURSIVIDAD 
 * FECHA;26/NOV/24
 */
public class RecursionLinealSumaTest {
     public static void main(String[] args) {
        // Ejemplo 1 
        int [] data1 = {1,2,3,4};
        System.out.println("Suma para data 1: "+ RecursionLinealSuma.linearSum(data1, data1.length));
        
         // Ejemplo 2
        int [] data2 = {5,6,7,9};
        System.out.println("Suma para data 2: "+ RecursionLinealSuma.linearSum(data2, data2.length));
        
         // Ejemplo 3
        int [] data3 = {10,3,6,9};
        System.out.println("Suma para data 3: "+ RecursionLinealSuma.linearSum(data3, data3.length));
        
     }
}
