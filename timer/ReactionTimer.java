import java.util.Scanner;

public class ReactionTimer{

    public static void main(String[] args) throws InterruptedException {
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);

        System.out.println("Go!!!");

        long startTime = System.currentTimeMillis();
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        long stopTime = System.currentTimeMillis();
        long reactionTime = stopTime - startTime;
        System.out.println("the first word you typed is " + s);
        System.out.println("your reaction time was " + reactionTime + " ms");
    }
}