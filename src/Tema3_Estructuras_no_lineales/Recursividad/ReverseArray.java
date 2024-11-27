/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema3_Estructuras_no_lineales.Recursividad;

/**
 *
 * @author vanesahonorato
 */
public class ReverseArray {
    public static void reverseArray(int[] data, int low, int high) {
        if (low < high) { 
            int temp = data[low];      
            data[low] = data[high];  
            data[high] = temp;      
            reverseArray(data, low + 1, high - 1); 
        }
     }
}