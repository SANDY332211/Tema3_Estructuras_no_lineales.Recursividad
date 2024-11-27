
package Tema3_Estructuras_no_lineales.Recursividad;
/**
 *ITESS-TICS AGO-DIC 2024 ESTRUCTURA Y ORGANIZACIÓN DE EDATOS DOCENTE:
 * SANDRA ARACELI HERNANDEZ
 * DESCRIPCCION: PRACTICA DE MEDIR EL TIEMPO EN RECURSIVIDAD MALA Y BUENA 
 * FECHA;26/NOV/24
 */
public class Potencias {
 public static double powerBad(double x, int n) {
        if (n == 0) 
            return 1;
         else {
            return x * powerBad(x, n - 1);
        }
    }

    public static double powerGood(double x, int n) {

        if (n == 0) 
            return 1;
         else {
            double partial = powerGood(x, n / 2);
            double result = partial*partial;
            if (n % 2 ==1) 
            result *= x;
            return result;
        }

    }
}