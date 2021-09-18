public class BasicEncryption {
    public static void main(String[] args) {
        int key = 7;
        String text = "Hi, are you alright ?";
        System.out.println(text);

        char[] chars = text.toCharArray();

        for (char c : chars){
            c += key;
            System.out.print(c);
        }
        
    }
}
