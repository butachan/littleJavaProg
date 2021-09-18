public class Palindrome {
    public static void main(String[] args) {
        String original = "nursesr un";
        original = original.replace(" ", "");
        String reverse = "";
        for (int i = original.length() - 1 ; i >=0 ; i--){
            reverse += original.charAt(i);
            System.out.println(reverse);
        }

        boolean palindrome = true;
        for(int i = 0 ; i < original.length(); i++)
        {
            if (reverse.charAt(i) != original.charAt(i))
            {
                palindrome = false;
            }
        }
        if (palindrome)
        {
            System.out.println("this is a palindrome");
        }
        else System.out.println("this is not palindrome");
    }
    
}
