import java.util.Random;

public class RollingDice {
    public static void main(String[] args) {
        Random rnd = new Random();
        int x = rnd.nextInt(6)+1;
        System.out.println("you rolled a : " + x);
    }
}

