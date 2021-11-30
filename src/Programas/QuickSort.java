/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas;

/**
 *
 * @author JGA_G
 */
public class QuickSort {
    public static void main(String[] args) {

        //Numeros para ordenar
        int n = 10;
        int[] Q = new int[n];
        System.out.println("Sin ordenar");
        for (int i = 0; i < n; i++) {
            Q[i] = (int) (Math.random() * 100) + 1;
        }
        for (int x : Q) {
            System.out.print(" " + x);
        }
        System.out.println("");
        System.out.println("Orden ascendente");

        QuicksortAsc(Q, 0, Q.length - 1);
        for (int x : Q) {
            System.out.print(" " + x);
        }
        System.out.println("");


    }

    //Metodo de Ordenamiento QuickSort
    public static void QuicksortAsc(int numeros[], int izq, int der) {
        /*Este metodo recibe un arreglo de numero, y dos enteros que referencian el primer valor
            Y el ultimo*/

        //Se toma como pivote el primer valor
        int pivote = numeros[izq];

        //Se definen los dos lados y un auxiliar
        int i = izq;
        int j = der;
        int aux;

        while (i < j) {
            while (numeros[i] <= pivote && i < j) {
                i++;
            }

            while (numeros[j] > pivote) {
                j--;
            }

            if (i < j) {
                aux = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = aux;
            }
        }

        numeros[izq] = numeros[j];
        numeros[j] = pivote;

        if (izq < j - 1) {
            QuicksortAsc(numeros, izq, j - 1);
        }

        if (j + 1 < der) {
            QuicksortAsc(numeros, j + 1, der);
        }
    }
}
