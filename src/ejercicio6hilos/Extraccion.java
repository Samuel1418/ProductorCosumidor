/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6hilos;

import static ejercicio6hilos.Dineros.dinero;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class Extraccion extends Thread{
   private int extraido;
   private int c;
   Dineros obj=new Dineros();
   
   public void run() {
       for (int i = 0; i < 10; i++) {
         extraido=Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto quieres retirar?"));
         dinero=c+dinero-extraido;
         System.out.println("Quedan en la cuenta: "+dinero+"€");
         obj.get();
         try {
            sleep((int)(Math.random() * 100));
         } catch (InterruptedException e) { }
       }
   }
}
