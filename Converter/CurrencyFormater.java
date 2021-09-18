import java.text.NumberFormat;
import java.util.*;
public class CurrencyFormater {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double payment = scan.nextDouble();
        scan.close();

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment); 
        String ind = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment); 
        String ch = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment); 
        String fr = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment); 

        System.out.println("you wrote " + payment);
        System.out.println("US : " + us);
        System.out.println("India : " + ind);
        System.out.println("China : " + ch);
        System.out.println("France : " + fr);
    }
    
}
