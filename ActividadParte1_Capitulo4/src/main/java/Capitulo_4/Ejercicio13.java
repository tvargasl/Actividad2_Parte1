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
public class Ejercicio13 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int VALCOMP, VALPAG,PDES;
        String COLOR;
        

        System.out.println("Ingrese el valor de la compra: ");
        VALCOMP = sc.nextInt();
        System.out.println("Ingrese el color: ");
        COLOR = sc.next();
        
        if (COLOR == "BLANCO") {
            PDES = 0;
        } else if (COLOR == "VERDE") {
            PDES = 10;
        } else if (COLOR == "AMARILLO") {
            PDES = 25;
        } else if (COLOR =="AZUL") {
            PDES = 50;
        } else {
            PDES = 100;
        }
        
        VALPAG = VALCOMP - PDES * VALCOMP / 100;
        System.out.println("EL CLIENTE DEBE PAGAR: $" + VALPAG);
    }
            
}
