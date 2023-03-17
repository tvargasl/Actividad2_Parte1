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
public class Ejercicio24 {
    public static void main(String[] args) {
        
        int A, B, C;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el peso de la esfera A:");
        A = sc.nextInt();

        System.out.println("Ingrese el peso de la esfera B:");
        B = sc.nextInt();

        System.out.println("Ingrese el peso de la esfera C:");
        C = sc.nextInt();

        if (A > B && A > C) {
            System.out.println("La esfera A es la de mayor peso.");
        } else if (B > A && B > C) {
            System.out.println("La esfera B es la de mayor peso.");
        } else{
            System.out.println("La esfera C es la de mayor peso.");
        }
    }
}
