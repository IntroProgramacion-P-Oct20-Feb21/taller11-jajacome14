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
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        String cadena;
        double notasEstudiantes[] = new double[4];

        for (int i = 0; i < notasEstudiantes.length; i++) {
            System.out.println("Ingrese nota del estudiante");
            notasEstudiantes[i] = entrada.nextDouble();
        }
        cadena = promedioCualitativo(notasEstudiantes[0], notasEstudiantes[1],
                notasEstudiantes[2], notasEstudiantes[3]);
        System.out.println(cadena);
    }

    public static String promedioCualitativo(double nota1, double nota2,
            double nota3, double nota4) {
        double suma;
        double promedio;
        String promCualitativo = "";
        String mensaje;
        suma = nota1 + nota2 + nota3 + nota4;
        promedio = suma / 4;
        if ((promedio >= 0) && (promedio <= 5)) {
            promCualitativo = "Regular";
        } else {
            if ((promedio >= 5.1) && (promedio <= 8)) {
                promCualitativo = "Bueno";
            } else {
                if ((promedio >= 8.1) && (promedio <= 9)) {
                    promCualitativo = "Muy Bueno";
                } else {
                    if ((promedio >= 9.1) && (promedio <= 10)) {
                        promCualitativo = "Sobresaliente";
                    }
                }
            }
        }
        mensaje = String.format("El promedio de las notas: %s, %s, %s, %s es "
                + "%s", nota1, nota2, nota3, nota4, promCualitativo);
        return mensaje;
    }
}


    
    

