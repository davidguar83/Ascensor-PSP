/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascensor;

/**
 *
 * @author david
 */
public class Main extends Thread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        Cubby a1 = new Cubby();

        Plantas_0 p0 = new Plantas_0("Planta Baja", a1);
        Planta_1 p1 = new Planta_1("Planta Primera", a1);
        Planta_2 p2 = new Planta_2("Planta Segunda", a1);
        Planta_3 p3 = new Planta_3("Planta Tercera", a1);
        Ascensor asce = new Ascensor(a1, "ascensor");
        

        p0.start();
        p0.join();
        p1.start();
        p1.join();
        p2.start();
        p3.start();
        asce.start();
        
    }

}
