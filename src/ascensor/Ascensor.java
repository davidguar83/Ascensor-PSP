/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascensor;

import java.util.Random;

/**
 *
 * @author david
 */
public class Ascensor extends Thread {

    Random ran = new Random();
    int alturaAscensor = 0;
    Cubby a;
    boolean bb = true;

    public Ascensor(Cubby a, String name) {
        super(name);
        this.a = a;
    }

    public void run() {

        if (bb) {
            alturaAscensor = a.getAscensor();

            System.out.print("El ascensor se encuentra en la planta " + alturaAscensor);

            alturaAscensor = ran.nextInt(4);

            a.putAscensor(alturaAscensor);

            System.out.println(" se dirige a planta " + alturaAscensor);

            a.putbooleam(false);
        }
        a.putbooleam(true);
    }
}
