/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6hilos;

import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class Ejercicio6Hilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Ingresp p1 = new Ingresp();
      Extraccion c1 = new Extraccion();
      p1.start();
      c1.start();
      
    }
    
}
