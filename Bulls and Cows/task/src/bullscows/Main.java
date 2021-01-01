package bullscows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




//        System.out.println("The secret code is prepared: ****.");
//        System.out.println("Turn 1. Answer");
//        System.out.println("1234");
//        System.out.println("Grade: None.");
//
//
//
//        System.out.println("Turn 2. Answer:");
//        System.out.println("9876");
//        System.out.println("Grade: 4 bulls.");
//        System.out.println("Congrats! The secret code is 9876.");





    }
}
class Gra{
    public void mainOfGame(){


        Scanner sc = new Scanner(System.in);

        String password= sc.next();
        String guessInput=sc.next();

        int[] passwordArray= new int[4];
        int[] guessArray= new int [4];
    }
}
class ArrayMaker{

  public int[] makeArrayFromString(int[] array, String string){

        for (int i=0;i<array.length;i++){
            array[i]=Integer.parseInt(string.substring(i,i+1));
        }
        return array;
    }
}
