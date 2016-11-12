// 1.Cate variante trebuie generate pt varianta castigatoare?
//


import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

public class Main {


    private int getRandomNumber(Random myNumbersMachine) {
        int nr = myNumbersMachine.nextInt(49) + 1;
        return nr;

    }

    public static void main(String[] args) {
        Main m = new Main();
        Random myNumbersMachine = new Random();
        int[] agencyNumbers=new int[6];
        int[] myNumbers=new int[6];


        //Nr. agentiei
        System.out.println("\nNr. agentiei:");

        for (int i = 0; i < 6; i++) {

            int number = m.getRandomNumber(myNumbersMachine);
            System.out.print(number+",");
            agencyNumbers[i]=number;



        }



        System.out.println("\n");
        System.out.println("\nNr. mele:");
        int counter = 0;
        int nrTickets=0;

        //Nr. mele *
      while(counter<6){
          nrTickets++;
          counter=0;
            for (int i = 0; i < 6; i++) {

                int number = m.getRandomNumber(myNumbersMachine);
                System.out.print(number + ",");
                myNumbers[i] = number;


            }

            // compar *

            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    if (agencyNumbers[j] == myNumbers[k])
                        counter++;

                }
            }

            System.out.println("\n");


        }

        System.out.println("Ai nimerit 6 nr jucand: "+nrTickets+" variante");

    }
}
