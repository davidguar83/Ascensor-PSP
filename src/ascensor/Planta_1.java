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
public class Planta_1 extends Thread {

    Random ran = new Random();
    int alturaAscansor;
    int nivelPlanta = 1;

    Cubby a;

    public Planta_1(String name, Cubby a) {
        super(name);
        this.a = a;

    }

    public void run() {

        if (nivelPlanta == a.getAscensor()) {

            alturaAscansor = (ran.nextInt(4));
            if (alturaAscansor == 1) {

                alturaAscansor++;
                a.putAscensor(alturaAscansor);

                System.out.println(getName() + " el ascensor se dirige a planta " + alturaAscansor);
            } else {

                System.out.println(getName() + " el ascensor se dirige a planta " + alturaAscansor);
                a.putAscensor(alturaAscansor);
                a.putbooleam(false);
            }

        } else {

            a.putAscensor(1);

            System.out.println(getName() + " llamando a ascensor a planta " + nivelPlanta);

            alturaAscansor = (ran.nextInt(4));
            if (alturaAscansor == 1) {

                alturaAscansor++;
                a.putAscensor(alturaAscansor);

                System.out.println(getName() + " el ascensor se dirige a planta " + alturaAscansor);
            } else {

                System.out.println(getName() + " el ascensor se dirige a planta " + alturaAscansor);
                a.putAscensor(alturaAscansor);
            }
            a.putbooleam(false);
        }

        a.putbooleam(true);
    }
}
