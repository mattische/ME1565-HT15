import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<String>();
        Main m = new Main();

        System.out.print("Enter text (q - quit): ");
        String txt = s.nextLine();

        while(!txt.equalsIgnoreCase("q")) {
            lines.add(txt);
            System.out.print("Enter text (q - quit): ");
            txt = s.nextLine();
        }
        int items = lines.size();
        for (int i = 0; i < items; i++) {
            int r = (int) (Math.random() * lines.size());
            String temp = lines.remove(r);
            System.out.println(temp);
            m.palindromeChecker(temp);
        }


    }
















    public boolean palindromeChecker(String txt) {
        //check if string is palindrome...
        String p = "";
        for(int i = txt.length()-1; i >= 0; i--) {
            System.out.print(txt.charAt(i));
            p = p + String.valueOf(txt.charAt(i));
        }
        System.out.println();
        if (txt.equalsIgnoreCase(p)) {
            System.out.println("\nHOORAY MACKARAY! IT IS AN PALIINDROME! " + p);
            return true;
        }
        return false;
    }
}
