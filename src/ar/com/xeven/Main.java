package ar.com.xeven;
/*
Modifica el programa anterior de tal forma que las cartas se muestren ordenadas.
Primero se ordenarán por palo: bastos, copas, espadas, oros. Cuando
coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey.
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Carta> cartas = new ArrayList<Carta>();

        Carta carta1 = new Carta();
        cartas.add(carta1);

        for (int i=0;i<9;i++) {
            do {
                carta1 = new Carta();
            } while (cartas.contains(carta1));

            cartas.add(carta1);
        }

        Collections.sort(cartas);

        for (Carta carta:cartas)
            System.out.println(carta);

    }
}
