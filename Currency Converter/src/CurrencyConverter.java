import java.util.HashMap;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main (String[] args){
        HashMap<Integer, String> currencycodes = new HashMap<Integer, String>(); // i want to hashmap over each key values.
//add currency codes
        currencycodes.put(1, "USD");
        currencycodes.put(2, "CAD");
        currencycodes.put(3, "EUR");
        currencycodes.put(4, "HKD");
        currencycodes.put(5, "INR");

        String fromCode, toCode; // trying to see what you want to go from one end to the other
        double amount; // amount you want to convert.

        Scanner scanner = new Scanner (System.in);//this will help get the input.

    }
}
