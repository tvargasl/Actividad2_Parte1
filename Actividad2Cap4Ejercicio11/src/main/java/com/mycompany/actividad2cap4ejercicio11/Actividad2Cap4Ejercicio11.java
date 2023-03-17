package com.mycompany.actividad2cap4ejercicio11;
import java.util.Scanner;
public class Actividad2Cap4Ejercicio11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float mayor;
        
        System.out.println("Ingrese el valor de A:");
        float A = entrada.nextFloat();
        
        System.out.println("Ingrese el valor de B:");
        float B = entrada.nextFloat();
        
        System.out.println("Ingrese el valor de C:");
        float C = entrada.nextFloat();
        
        
        if (A>B && A>C) {
            mayor = A;
        }
        else if (B>C){
            mayor = B;
        }
        else {
            mayor = C;
        }
        System.out.println("El mayor numero entre "+A+", "+B+", "+C+" es "+mayor);
        
    }
}
