/**
 * Created by eyerash-zen on 2015-11-26.
 */
public class Main {
    public static void main (String[] args){
        Inmatare inmatare = new Inmatare(); //Creating new object of the class Inmatare.
        inmatare.fillTheArray(); //Calling method fillTheArray to fill out the "space" in the arrays;
        inmatare.sumAmountOfNumbers(); //Summing amount of numbers.
        inmatare.consoleRespons("The total result are equal to: -> " + inmatare.getResult());
        inmatare.consoleRespons("Have an awesome day!");
    }
}
