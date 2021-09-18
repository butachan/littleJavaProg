import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.List; //if forgot, error can not convert ...

import sun.awt.www.content.audio.x_aiff;

public class TicTacToe {

    static ArrayList<Integer> playerPositions = new ArrayList<>();
    static ArrayList<Integer> cpuPositions = new ArrayList<>();
    public static void main(String[] args) {
        char[][] gameBoard ={ {' ' , '|' , ' ' , '|' , ' ' },
                              {'-' , '+' , '-' , '|' , '-' },
                              {' ' , '|' , ' ' , '|' , ' ' },
                              {'-' , '+' , '-' , '|' , '-' },
                              {' ' , '|' , ' ' , '|' , ' ' }};
        PrintGameBoard(gameBoard); 

        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your placement (1 - 9 ): ");
            int playerPos = scan.nextInt(); 
            while(playerPositions.contains(playerPos) || cpuPositions.contains(playerPositions))
            {
                System.out.println("position taken ! enter a correct position");
                playerPos = scan.nextInt();
            }

            PlacePiece(playerPos, gameBoard, "player");
            Random rnd = new Random();
            int cpuPos = rnd.nextInt(9)+1;
            while(playerPositions.contains(cpuPositions) || cpuPositions.contains(cpuPos))
            { 
                System.out.println("position taken, change");
                cpuPos = rnd.nextInt(9)+1;
            }
            PlacePiece(cpuPos, gameBoard, "cpu");
            PrintGameBoard(gameBoard);
            String result = CheckWinner();
            System.out.println(result);
        }
       
    }
    
    
    public static void PrintGameBoard(char[][] gameBoard)
    {
        for (char[] row : gameBoard){
            for(char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void PlacePiece(int pos, char[][] gameBoard, String user){
        char symbol = ' ';
        if (user.equals("player")) {
            symbol = 'X';
            playerPositions.add(pos);
        }
        else if (user.equals("cpu")){
            symbol = 'O';
            cpuPositions.add(pos);
        }
        switch(pos){
            case 1 : gameBoard[0][0] = symbol;
            break;
            case 2 : gameBoard[0][2] = symbol;
            break;
            case 3 : gameBoard[0][4] = symbol;
            break;
            case 4 : gameBoard[2][0] = symbol;
            break;
            case 5 : gameBoard[2][2] = symbol;
            break;
            case 6 : gameBoard[2][4] = symbol;
            break;
            case 7 : gameBoard[4][0] = symbol;
            break;
            case 8 : gameBoard[4][2] = symbol;
            break;
            case 9 : gameBoard[4][4] = symbol;
            break;
            default: break;
        }
    }

    public static String CheckWinner(){
       
        List<Integer> topRow = Arrays.asList(1, 2, 3);
        List<Integer> midRow = Arrays.asList(4, 5, 6);
        List<Integer> downRow = Arrays.asList(7 ,8, 9);
        List<Integer> leftCol= Arrays.asList(1, 4, 7);
        List<Integer> midCol = Arrays.asList(2, 5, 8);
        List<Integer> rightCol = Arrays.asList(3, 6, 9);
        List<Integer> cross1 = Arrays.asList(1, 5, 9);
        List<Integer> cross2 = Arrays.asList(7, 5, 3);

        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(downRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(cross1);
        winning.add(cross2);

        for (List l : winning){
            if(playerPositions.containsAll(l)){
                return "Congrats you won";
            }else if (cpuPositions.containsAll(l)){
                return "CPU wins! sorry";
            }else if (playerPositions.size() + cpuPositions.size() == 9){
                return "Draw";
            }
        }

        return "";
    }
}
