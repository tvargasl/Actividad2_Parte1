/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capitulo_4;

import java.util.Scanner;

/**
 *
 * @author JEFERSON
 */
public class Ejercicio23 {

    public static void main(String[] args) {

        double a, b, c, x1, x2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor de A:");
        a = sc.nextDouble();

        System.out.println("Ingrese el valor de B:");
        b = sc.nextDouble();

        System.out.println("Ingrese el valor de C:");
        c = sc.nextDouble();
        if ((Math.sqrt(Math.pow(b, 2) - 4 * a * c)) > 0) {

            x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

            x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

            System.out.println("Las raices de la ecuación son:");

            System.out.println("x1 = " + x1);

            System.out.println("x2 = " + x2);
        }else{
            System.out.println("La ecuacion no tiene solución");
        }
    }
}
