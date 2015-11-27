import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;


public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("How many nbrs? ");
        int amount = s.nextInt();

        int[] nbrs = new int[amount];

        //mata in talen
        for (int i = 0; i < nbrs.length; i++) {
            System.out.print("Number: ");
            nbrs[i] = s.nextInt();
        }

        int sum = 0;
        int high = MIN_VALUE;
        int low = MAX_VALUE;
        //presentera talen
        for (int i = 0; i < nbrs.length; i++) {
            System.out.print(nbrs[i] + " ");
            sum = sum + nbrs[i];

            if(nbrs[i] > high)
                high = nbrs[i];
            if(nbrs[i] < low)
                low = nbrs[i];
        }

        int avg = sum / nbrs.length;
        System.out.println("\nThe sum is " + sum);
        System.out.println("The average sum is " + avg);
        System.out.println("Highest number is: " + high);
        System.out.println("Lowest number is: " + low);


        s.close();
    }
}
