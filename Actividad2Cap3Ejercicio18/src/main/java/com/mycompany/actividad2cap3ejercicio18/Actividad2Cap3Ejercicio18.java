package com.mycompany.actividad2cap3ejercicio18;
import java.util.Scanner;
public class Actividad2Cap3Ejercicio18 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el codigo del empleado:");
        String codigo = entrada.next();
        
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = entrada.next();
        
        System.out.println("Ingrese el numero de horas trabajadas al mes del empleado:");
        float horas = entrada.nextFloat();
        
        System.out.println("Ingrese el valor de la hora trabajada:");
        float valorhora = entrada.nextFloat();
        
        System.out.println("Ingrese el porcentaje de retencion en la fuente:");
        float retencion = entrada.nextFloat();
        
        retencion = retencion / 100;
        float bruto = horas * valorhora;
        float neto = bruto - (bruto * retencion);
        
        System.out.println("Los datos que se tienen son:");
        System.out.println("CODIGO DEL EMPLEADO: "+codigo);
        System.out.println("NOMBRE DEL EMPLEADO: "+nombre);
        System.out.println("SALARIO BRUTO DEL EMPLEADO: "+bruto);
        System.out.println("SALARIO NETO DEL EMPLEADO: "+neto);
        
        
    }
}
