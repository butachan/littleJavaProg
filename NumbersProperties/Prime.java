import java.util.ArrayList;

public class Prime {
    public static void main(String[] args) {
        
        findPrimes(1,5);
        System.out.println(IsPrime(33));
        System.out.println(findPrimes(2, 20));
       
    }
    public static ArrayList<Integer> findPrimes(int start, int end)
    {
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        for (int i = start ; i <= end ; i++)
        {
            if (IsPrime(i))
            {primeNumbers.add(i); }

        }
        return primeNumbers;
    }

    public static boolean IsPrime(int n)
    {
        int i = 2;
        while(i<n/2)
        {
            if (n % i ==0 ) {return false;}
            i++;
        }
        return true;
    }
}
