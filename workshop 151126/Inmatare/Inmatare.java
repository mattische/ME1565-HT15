import java.util.Scanner;

/**
 * Created by eyerash-zen on 2015-11-26.
 */
public class Inmatare {
    private int amountOfNumbers;
    private int[] numbersToSum;
    private Scanner myScanner;
    private int totalSum;

    public Inmatare(){
       //Creating a new scanner and passing System.instream as args.
        myScanner = new Scanner(System.in);
        this.consoleRespons("How many numbers?"); //Sending args to method consoleRespons.
        this.amountOfNumbers = myScanner.nextInt(); //How Many
        numbersToSum = new int[this.amountOfNumbers];
        //myScanner.close();
    }
    public void fillTheArray(){

        for(int a = 0; a<numbersToSum.length; a++){
            this.consoleRespons("Position:" + a);
            numbersToSum[a] = myScanner.nextInt();

        }
        myScanner.close();
    }
    public int getResult(){
        return this.totalSum;
    }
    public int sumAmountOfNumbers(){
        for(int a = 0; a<numbersToSum.length; a++){
            this.totalSum += numbersToSum[a];
        }
        return this.totalSum;
    }
    public void consoleRespons(String message){
        System.out.println(message);
    }
}
