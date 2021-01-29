/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        int opcion;
        int cedula;
        String nombre;

        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su cedula");
        cedula = entrada.nextInt();
        System.out.println("Ingrese 1 si desea saber el valor de la planilla "
                + "de luz\nIngrese 2 si desea saber el precio de un bien "
                + "inmueble");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            calcularValorLuz(nombre, cedula);
        } else {
            if (opcion == 2) {
                calcularPrecio(nombre, cedula);
            } else {
                System.out.println("Opcion incorrecta");
            }
        }

    }

    public static void calcularValorLuz(String nom, int ced) {
        Scanner entrada = new Scanner(System.in);
        double valorKilovatio;
        double kilovatiosMes;
        double resultado;

        System.out.println("Ingrese el valor del kilovatio");
        valorKilovatio = entrada.nextDouble();

        System.out.println("Ingrese el numero de kilovatios consumidos al mes");
        kilovatiosMes = entrada.nextDouble();

        resultado = valorKilovatio * kilovatiosMes;
        System.out.printf("Cliente %s con cédula %s debe cancelar el valor de $"
                + "%.2f\n", nom, ced, resultado);
    }

    public static void calcularPrecio(String nom, int ced) {
        Scanner entrada = new Scanner(System.in);
        double valor;
        double valorPagar;

        System.out.println("Ingrese el valor del inmueble");
        valor = entrada.nextDouble();
        valorPagar = (valor * 2) / 100;
        System.out.printf("Cliente %s con cédula %s tiene un bien inmueble "
                + "valorado en $%.2f y tiene que pagar de precio $%.2f\n",
                nom, ced, valor, valorPagar);

    }
    
}
