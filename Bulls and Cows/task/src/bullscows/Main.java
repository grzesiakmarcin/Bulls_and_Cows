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

        Scanner sc = new Scanner(System.in);

        String input= sc.next();

        String guessInput=sc.next();

        int[] InputArray= new int[4];
        int[] guessArray= new int [4];

        int cows=0;
        int bulls =0;

        for (int i =0; i<4;i++){
           InputArray[i]=Integer.parseInt(input.substring(i,i+1));
        }

        for (int i =0; i<4;i++){
            guessArray[i]=Integer.parseInt(guessInput.substring(i,i+1));
        }


        for (int i=0; i<4;i++){

            if (InputArray[i]==guessArray[i]){
                bulls++;
            }


        }

        for (int element: InputArray) {
            for(int i=0;i<4;i++){
                if (element==guessArray[i]){
                    cows++;
                }
            }


        }

        System.out.println("The number "+guessInput+" contains " +bulls+" bulls and "+ cows+" cows.");








    }
}
class Array{


}

class Gra {
    Scanner sc = new Scanner(System.in);

    String input= sc.next();

    String guessInput=sc.next();

    int[] InputArray= new int[4];
    int[] guessArray= new int [4];














    public int[] makeAnArray (String ourInput, int[] Array){
        for (int i =0; i<4;i++){
            Array[i]=Integer.parseInt(ourInput.substring(i,i+1));
        }
        return Array;
    }

}

class ArrayMaker{

//    public ArrayMaker(int[] output, String wsad) {
//
//    }

   static int[] zrobTabel(int[] output, String wsad){

        for (int i =0; i<4;i++){
            output[i]=Integer.parseInt(wsad.substring(i,i+1));
        }

        return output;

    }
}