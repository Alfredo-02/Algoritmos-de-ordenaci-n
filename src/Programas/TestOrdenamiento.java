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
        
        //bubbleSort (Descendente reordenamiento)
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
        
        
        
        
            
           
    }
    
}
