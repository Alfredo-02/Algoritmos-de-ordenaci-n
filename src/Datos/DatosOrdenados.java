/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Noemí Lara Acono
 */
public class DatosOrdenados {
    private int [] valores; 

    public DatosOrdenados(int[] valores) {
        this.valores = valores;
    }

    DatosOrdenados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getSize(){
        return valores.length; 
    }
    
    @Override
    public String toString(){
        String cad = "Datos ordenados: ";
        for (int x : valores){
            cad += x + ", ";
        }
        return cad;
    }
    
}
