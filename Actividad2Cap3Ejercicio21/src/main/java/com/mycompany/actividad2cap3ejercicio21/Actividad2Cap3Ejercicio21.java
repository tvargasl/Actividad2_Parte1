package com.mycompany.actividad2cap3ejercicio21;
import java.util.Scanner;
public class Actividad2Cap3Ejercicio21 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el lado A del triangulo:");
        float A = entrada.nextFloat();
         System.out.println("Ingrese el lado B del triangulo:");
        float B = entrada.nextFloat();
         System.out.println("Ingrese el lado A del triangulo:");
        float C = entrada.nextFloat();
        
        float perimetro = A + B + C;
        double semiperimetro = perimetro / 2;
        double area = Math.sqrt(semiperimetro*(semiperimetro-A)*(semiperimetro-B)*(semiperimetro-C));
        
        System.out.println("El perimetro del triangulo es: "+perimetro);
        System.out.println("El semiperimetro del triangulo es: "+semiperimetro);
        System.out.println("El area del triangulo es: "+area);
     
    }
}
