import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by user on 11/12/2016.
 */
public class Ionel {
    public static void main(String[] args) {
        List ionel = new ArrayList<Integer>();
        for (int i = 1; i <= 49; i++) {
            ionel.add(i);
        }
        Collections.shuffle(ionel);
        System.out.print("\nNumerele agentiei:");
        for (int i = 1; i <= 6; i++) {

            System.out.print(ionel.get(i) + " ,");
        }



        System.out.print("\nNumerele mele:");
        int nrTickets=0;
        int counter =0;


        //Nr. mele *
        while (counter < 6) {
        nrTickets++;
            counter=0;
            List sami = new ArrayList<Integer>();
            for (int i = 1; i <= 49; i++) {
                sami.add(i);
            }
            Collections.shuffle(sami);
        for (int i = 1; i <= 6; i++) {

            System.out.print(sami.get(i) + " ,");
        }



        //Nr. mele *

        nrTickets++;



            // compar *

            for (int j = 1; j <= 6; j++) {
                for (int k = 1; k <= 6; k++)
                if (ionel.get(j).equals(sami.get(k)))
                    counter++;


            }
            System.out.println("\n");
        }
        System.out.println("Ai nimerit 6 nr jucand: "+nrTickets+" variante");

    }
}


