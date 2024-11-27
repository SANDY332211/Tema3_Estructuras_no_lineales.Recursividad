
package Tema3_Estructuras_no_lineales.Recursividad;

/**
 *ITESS-TICS AGO-DIC 2024 ESTRUCTURA Y ORGANIZACIÓN DE EDATOS DOCENTE:
 * SANDRA ARACELI HERNANDEZ
 * DESCRIPCCION: PRACTICA DE SUMA RECURSIVIDAD 
 * FECHA;26/NOV/24
 */
public class RecursionLinealSuma {
    public static int linearSum(int[]data, int n){
        if (n==0)
            return 0;
        else
            return linearSum(data, n-1)+data [n-1];
    }
}
