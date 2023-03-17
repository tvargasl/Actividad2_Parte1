package com.mycompany.actividad2cap3ejercicio19;
import java.util.Scanner;
public class Actividad2Cap3Ejercicio19 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de uno de los lados del triangulo Equilatero:");
        float lado = entrada.nextFloat();
        
        float perimetro = lado * 3;
        double altura = (Math.sqrt(3) * lado) / 2;
        double area = (lado * altura) / 2;
        
        System.out.println("El perimetro del triangulo equilatero es: "+perimetro);
        System.out.println("La altura del triangulo equilatero es: "+altura);
        System.out.println("El area del triangulo equilatero es: "+area);
        
        
                
        
        
    }
}
