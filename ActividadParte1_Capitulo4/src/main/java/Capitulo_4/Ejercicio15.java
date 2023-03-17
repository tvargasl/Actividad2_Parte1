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
public class Ejercicio15 {
    public static void main(String[] args) {
         
        int pesoA, pesoB, pesoC, pesoD;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el peso de la esfera A: ");
        pesoA = sc.nextInt();
        System.out.print("Ingrese el peso de la esfera B: ");
        pesoB = sc.nextInt();
        System.out.print("Ingrese el peso de la esfera C: ");
        pesoC = sc.nextInt();
        System.out.print("Ingrese el peso de la esfera D: ");
        pesoD = sc.nextInt();

        if ((pesoA == pesoB) && (pesoA == pesoC)) {
            if (pesoD > pesoA) {
                System.out.print("LA ESFERA D ES LA DIFERENTE Y");
            } else {
                System.out.print("LA ESFERA D ES LA DIFERENTE Y");
            }
        } else if ((pesoA == pesoB) && (pesoA == pesoD)) {
            System.out.print("LA ESFERA C ES LA DIFERENTE");
            if (pesoC > pesoA) {
                System.out.print(" Y ES DE MAYOR PESO");
            } else {
                System.out.print(" Y ES DE MENOR PESO");
            }
        } else if ((pesoA == pesoC) && (pesoA == pesoD)) {
            System.out.print("LA ESFERA B ES LA DIFERENTE");
            if (pesoB > pesoD) {
                System.out.print(" Y ES DE MAYOR PESO");
            } else {
                System.out.println(" Y ES DE MENOR PESO");
            }
        } else {
            System.out.print("LA ESFERA A ES LA DIFERENTE");
            if (pesoA > pesoB) {
                System.out.print(" Y ES DE MAYOR PESO");
            } else {
                System.out.print(" Y ES DE MENOR PESO");
            }
        }
    }
  
}
