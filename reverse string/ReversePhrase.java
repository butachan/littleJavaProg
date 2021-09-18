import java.util.LinkedList;
import java.util.Stack;

public class ReversePhrase {
    public static void main(String[] args)
    {
        String expression = Reverse("mortifère");
        String expression2 = ReverseWithStack("pharmacie");
        System.out.println(expression);
        System.out.println(expression2);
    }
    public static String Reverse( String s)
    {
        char[] c = new char[s.length()];
        int cIndex= 0; 
        for ( int i = s.length()-1 ; i >=0 ;i--)
        {
            c[cIndex] = s.charAt(i); // when reversed each character will be correctly indexed
            System.out.println(c[cIndex]);
            cIndex++;

        }
        String reverse = "";
        for (int i = 0 ; i< s.length() ; i++)
        {
            reverse = reverse + c[i];
        }
        return reverse;
    }
    /*using stacks (piles)*/
    public static String ReverseWithStack( String s)
    {
        LinkedList<Character> letter = new LinkedList<Character>();
        String reverse = "";
        for (int i = 0 ; i < s.length() ; i++)
        {
            letter.addFirst(s.charAt(i));
            reverse = reverse + letter.get(i);
        }
       for (int i = 0 ; i < letter.size(); i++)
        {
            reverse = reverse + letter.get(i);
        }
        return reverse;
    }
}