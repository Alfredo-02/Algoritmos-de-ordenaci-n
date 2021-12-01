/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas;

import Datos.DatosDesordenados;
import Datos.DatosOrdenados;
import javax.swing.JOptionPane;

/**
 *
 * @author Noemí Lara Acono
 */
public class TestOrdenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DatosDesordenados m;
        //DatosOrdenados datosOrd;
        int n, s; 
        long t, t1, t2;
        
        n = Integer.parseInt(JOptionPane.showInputDialog(
                "¿Cuántos datos son?"));
        s = Integer.parseInt(JOptionPane.showInputDialog(
                "¿Cuál es el valor máximo?"));
        
        m = new DatosDesordenados(s, n);
        m.generarValores();
        System.out.println("" + m);
        
        //bubbleSort (Ascendente)
        t1 = System.nanoTime();   // start
        DatosOrdenados mob = m.bubbleSort();
        t2 = System.nanoTime();   // stop
        t = t2 - t1;
        System.out.println("n = "+ n + " t = " + t + "ns. Algoritmo Burbuja Ascendente = " + mob);
        
        System.out.println("* * * * * * * * * * * * * * * ");
        
        //bubbleSort (Datos ordenados)
        t1 = System.nanoTime();   // start
        mob = m.bubbleSort();
        t2 = System.nanoTime();   // stop
        t = t2 - t1;
         System.out.println("n = "+ n + " t = " + t + "ns. Algoritmo Burbuja Ascendente Mejor Caso = " + mob);
        
        System.out.println("* * * * * * * * * * * * * * * ");
        
        //bubbleSort (Descendente)
        t1 = System.nanoTime();   // start
        mob = m.bubbleSortDescendente();
        t2 = System.nanoTime();   // stop
        t = t2 - t1;
        System.out.println("n = "+ n + " t = " + t + "ns. Algoritmo Burbuja Descendente = " + mob);
        
        System.out.println("* * * * * * * * * * * * * * * ");
        
        //quickSort (Ascendente)
        t1 = System.nanoTime();   // start
        DatosOrdenados moq = m.QuicksortAscendente();
        t2 = System.nanoTime();   // stop 
        t = t2 - t1;
        System.out.println("n = "+ n + " t = " + t + "ns. Algoritmo Quicksort Ascendente = " + moq);
        
        System.out.println("* * * * * * * * * * * * * * * ");
        
        //quickSort (Datos ordenados)
        t1 = System.nanoTime();   // start
        moq = m.QuicksortAscendente();
        t2 = System.nanoTime();   // stop 
        t = t2 - t1;
        System.out.println("n = "+ n + " t = " + t + "ns. Algoritmo Quicksort Ascendente Mejor Caso = " + moq);
        
        System.out.println("* * * * * * * * * * * * * * * ");
        
        //quickSort (Descendente)
        t1 = System.nanoTime();   // start
        moq = m.QuickSortDescendente();
        t2 = System.nanoTime();   // stop 
        t = t2 - t1;
        System.out.println("n = "+ n + " t = " + t + "ns. Algoritmo Quicksort Descendete = " + moq);
        
        System.out.println("* * * * * * * * * * * * * * * ");
        
          //Shellsort (Ascendente)
        t1 = System.nanoTime();   // start
        DatosOrdenados mo = m.shell();
        t2 = System.nanoTime();   // stop 
        t = t2 - t1;
        System.out.println("n = "+ n + " t = " + t + "ns. Algoritmo Shellsort Ascendente = " + mo);
        
        System.out.println("* * * * * * * * * * * * * * * ");
        
         //Shellsort (Datos Ordenados)
        t1 = System.nanoTime();   // start
        mo = m.shell();
        t2 = System.nanoTime();   // stop 
        t = t2 - t1;
        System.out.println("n = "+ n + " t = " + t + "ns. Algoritmo Shellsort Ascendente Mejor Caso = " + mo);
        
        System.out.println("* * * * * * * * * * * * * * * ");
         
        //Shellsort (Descendente)
        t1 = System.nanoTime();   // start
        mo = m.shellDescendente();
        t2 = System.nanoTime();   // stop 
        t = t2 - t1;
        System.out.println("n = "+ n + " t = " + t + "ns. Algoritmo Shellsort Descendente = " + mo);
        
        System.out.println("* * * * * * * * * * * * * * * ");
    
         //Radix (Ascendente)
        t1 = System.nanoTime();   // start
        DatosOrdenados mol = m.radix();
        t2 = System.nanoTime();   // stop 
        t = t2 - t1;
        System.out.println("n = "+ n + " t = " + t + "ns. Algoritmo Radix Ascendente = " + mol);
        
        System.out.println("* * * * * * * * * * * * * * * ");
        
        //Radix (Datos Ordenados)
        t1 = System.nanoTime();   // start
        mol = m.radix();
        t2 = System.nanoTime();   // stop 
        t = t2 - t1;
        System.out.println("n = "+ n + " t = " + t + "ns. Algoritmo Radix Ascendente Mejor Caso = " + mol);
        
        System.out.println("* * * * * * * * * * * * * * * ");
        
        //Radix (Descendente)
        t1 = System.nanoTime();   // start
        mol = m.radixDescendente();
        t2 = System.nanoTime();   // stop 
        t = t2 - t1;
        System.out.println("n = "+ n + " t = " + t + "ns. Algoritmo Radix Descendente = " + mol);
        
        System.out.println("* * * * * * * * * * * * * * * ");
}
}
