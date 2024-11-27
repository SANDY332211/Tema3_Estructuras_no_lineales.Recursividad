
package Tema3_Estructuras_no_lineales.Recursividad;

/**
 *ITESS-TICS AGO-DIC 2024 ESTRUCTURA Y ORGANIZACIÓN DE EDATOS DOCENTE:
 * SANDRA ARACELI HERNANDEZ
 * DESCRIPCCION: PRACTICA DE MEDIR EL TIEMPO EN RECURSIVIDAD MALA Y BUENA 
 * FECHA;26/NOV/24
 */

public class PotenciasTest{
        public static void main(String[] args) {
             long starTime = System.nanoTime();
        System.out.println(Tema3_Estructuras_no_lineales.Potencias.powerBad(3, 10000));
        long endTime = System.nanoTime();
        System.out.println((endTime - starTime) / 1e6 + "ms");
        
            System.out.println("");
        starTime = System.nanoTime();
        System.out.println(Tema3_Estructuras_no_lineales.Potencias.powerGood(3, 10000));
         endTime = System.nanoTime();
        System.out.println((endTime - starTime) / 1e6 + "ms");

    }
}
