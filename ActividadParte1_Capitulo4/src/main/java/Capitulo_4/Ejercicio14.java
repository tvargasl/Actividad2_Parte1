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
public class Ejercicio14 {

    public static void main(String[] args) {

        double VD1, VD2, VD3, SALAR, TOTVEN, PORVEN, SALAR1, SALAR2, SALAR3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese las ventas del departamento 1: ");
        VD1 = sc.nextDouble();
        System.out.println("Ingrese las ventas del departamento 2: ");
        VD2 = sc.nextDouble();
        System.out.println("Ingrese las ventas del departamento 3: ");
        VD3 = sc.nextDouble();
        System.out.println("Ingrese el salario que reciben los vendedores en cada departamento : ");
        SALAR = sc.nextDouble();

        TOTVEN = VD1 + VD2 + VD3;
        PORVEN = 0.33 * TOTVEN;

        if (VD1 > PORVEN) {
            SALAR1 = SALAR + 0.2 * SALAR;
        } else {
            SALAR1 = SALAR;
        }

        if (VD2 > PORVEN) {
            SALAR2 = SALAR + 0.2 * SALAR;
        } else {
            SALAR2 = SALAR;
        }

        if (VD3 > PORVEN) {
            SALAR3 = SALAR + 0.2 * SALAR;
        } else {
            SALAR3 = SALAR;
        }

        System.out.println("SALARIO VENDEDORES DEPTO. 1: " + SALAR1);
        System.out.println("SALARIO VENDEDORES DEPTO. 2: " + SALAR2);
        System.out.println("SALARIO VENDEDORES DEPTO. 3: " + SALAR3);
    }
}
