/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        valorPar(informacion);

    }

    public static void valorPar(int[][] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[i][j] % 2 == 0) {
                    System.out.println(arreglo[i][j]);
                }
            }

        }

    }

}


   
    

