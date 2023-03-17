package com.mycompany.actividad2cap4ejercicio10;
import java.util.Scanner;
public class Actividad2Cap4Ejercicio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de inscripcion:");
        int numero = entrada.nextInt();
        System.out.println("Ingrese el nombre del estudiante:");
        entrada.nextLine();
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el patrimonio:");
        float pat = entrada.nextFloat();
        System.out.println("Ingrese el estrato");
        int estrato = entrada.nextInt();
        
        double cobro = 50000;
        if(pat > 2000000 && estrato > 3){
            cobro = cobro + (pat* 0.03);
        }
       
        System.out.println("El numero de inscripcion es: "+numero);
        System.out.println("El nombre del estudiante es: "+nombre);
        System.out.println("El valor a pagar es: "+cobro);
        
    }
}
