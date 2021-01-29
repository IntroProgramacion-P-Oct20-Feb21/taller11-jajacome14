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
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        int opcion;
        System.out.println("Ingrese 1 si desea obtener el área del cuadrado\n"
                + "Ingrese 2 si desea obtener el área del triangulo\nIngrese 3 "
                + "si desea obtener el área de un rectángulo");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            obtenerAreaCuadrado();
        } else {
            if (opcion == 2) {
                obtenerAreaTriangulo();
            } else {
                if (opcion == 3) {
                    obtenerAreaRectangulo();
                } else {
                    System.out.println("Opción Incorrecta");
                }
            }
        }

    }

    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        int lado;
        int area;
        System.out.println("Ingrese el lado del cuadrado");
        lado = entrada.nextInt();
        area = lado * lado;
        System.out.println("El área del cuadrado es: " + area);
    }

    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        int base;
        int area;
        int altura;
        System.out.println("Ingrese la base del triángulo");
        base = entrada.nextInt();
        System.out.println("Ingrese la altura del triángulo");
        altura = entrada.nextInt();
        area = (altura * base) / 2;
        System.out.println("El área del triángulo es: " + area);
    }

    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        int base;
        int area;
        int altura;
        System.out.println("Ingrese la base del rectángulo");
        base = entrada.nextInt();
        System.out.println("Ingrese la altura del rectángulo");
        altura = entrada.nextInt();
        area = altura * base;
        System.out.println("El área del rectángulo es: " + area);

    }
}

    
  

