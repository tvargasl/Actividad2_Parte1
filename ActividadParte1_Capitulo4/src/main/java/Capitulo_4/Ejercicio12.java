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
public class Ejercicio12 {
    public static void main(String[] args) {
        String NOM;
        int NHT,VHN, HET, HEE8, SALARIO;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del trabajador: ");
        NOM = sc.nextLine();
        System.out.println("");
        
        System.out.print("Ingrese el número de horas trabajadas: ");
        NHT = sc.nextInt();
        System.out.println("");
        
        System.out.print("Ingrese el valor normal de la hora trabajada: ");
        VHN = sc.nextInt();
        System.out.println("");

        if (NHT > 40) {
            HET = NHT - 40;
            if (HET > 8) {
                HEE8 = HET - 8;
                SALARIO = 40 * VHN + 16 * VHN + HEE8 * 3 * VHN;
            } else {
                SALARIO = 40 * VHN + HET * 2 * VHN;
            }
        } else {
            SALARIO = NHT * VHN;
        }
        
        System.out.println("EL TRABAJADOR " + NOM + " DEVENGÓ: $" + SALARIO);   
    }
}
