/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6hilos;

/**
 *
 * @author Samuel
 */
public class Dineros extends Thread{
    public static Integer dinero=1000000;
   private boolean available = false;
   
   public synchronized int get() {
       while (available == false) {
         try {
            wait();
         } catch (InterruptedException e) {}
       }
      available = false;
      notifyAll();
      return dinero;
   }
   public synchronized void put(int value) {
       while (available == true) {
         try {
            wait();
         } catch (InterruptedException e) { } 
       }
      dinero = value;
      available = true;
      notifyAll();
   }
}
