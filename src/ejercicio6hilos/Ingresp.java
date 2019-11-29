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
public class Ingresp extends Thread{
   private int ingreso;
   Dineros obj=new Dineros();
   
   public void run() {
       for (int i = 0; i < 10; i++) {
         ingreso=Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto quieres ingresar?"));
         dinero=dinero+ingreso;
         obj.put(dinero);
         System.out.println("Quedan en la cuenta: "+dinero+"€");
         try {
            sleep((int)(Math.random() * 100));
         } catch (InterruptedException e) { }
       }
   }
  
}
