/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascensor;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class Cubby extends Thread {

    boolean movimiento = true;
    int planta = 0;
    int ascensor = 0;
    String dato;

    public synchronized int getplanta() {
        
        while(movimiento==false){
            
            try {
                wait(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Cubby.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }

        notify();
        return planta;
    }

    public synchronized int getAscensor() {
         while(movimiento==false){
            
            try {
                wait(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Cubby.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }

        notify();
        return ascensor;
    }

    public synchronized void putplanta(int altu) {
         while(movimiento==false){
            
            try {
                wait(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Cubby.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }

        planta = altu;
        notify();

    }

    public synchronized void putAscensor(int altu) {
         while(movimiento==false){
            
            try {
                wait(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Cubby.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }

        ascensor = altu;
        notify();

    }

    public synchronized void putbooleam(boolean mov) {

        this.movimiento = mov;

    }

}
