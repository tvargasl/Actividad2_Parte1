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
public class Ejercicio22 {
    public static void main(String[] args) {
         
        String nombre;
        int SH, HT, SM;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado:");
        nombre = sc.nextLine();

        System.out.println("Ingrese el salario básico por hora del empleado:");
        SH = sc.nextInt();

        System.out.println("Ingrese el número de horas trabajadas en el mes del empleado:");
        HT = sc.nextInt();

        SM = SH * HT;

        if (SM > 450000) {
            System.out.println("Nombre: " + nombre);
            System.out.println("Salario mensual: " + SM);
        } else {
            System.out.println("Nombre: " + nombre);
        }

    }
}
