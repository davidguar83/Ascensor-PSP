package ascensor;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author david
 */
public class Plantas_0 extends Thread {

    Random ran = new Random();
    int alturaAscansor;
    int nivelPlanta = 0;

    Cubby a;

    public Plantas_0(String name, Cubby a) {
        super(name);
        this.a = a;

    }

    public void run() {

        if (nivelPlanta == a.getAscensor()) {

            alturaAscansor = (1 + ran.nextInt(3));

            System.out.println(getName() + " Subiendo a planta " + alturaAscansor);

            a.putAscensor(alturaAscansor);
            a.putbooleam(false);

        } else {

            System.out.println(getName() + " llamando a ascensor a planta " + nivelPlanta);
            a.putAscensor(0);

            alturaAscansor = (1 + ran.nextInt(3));

            System.out.println(getName() + " Subiendo a planta " + alturaAscansor);

            a.putAscensor(alturaAscansor);
            a.putbooleam(false);

        }
        
        a.putbooleam(true);

    }

}
