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

        Gra myGame = new Gra();
        myGame.mainOfGame();




    }
}
class Gra{
    public void mainOfGame(){

        int bulls=0;
        int cows =0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Wpraowadz hasło");
        String password= sc.next();
        System.out.println("zgaduj hasło");
        String guessInput=sc.next();

        int[] passwordArray= new int[4];
        int[] guessArray= new int [4];



        passwordArray=new ArrayMaker().makeArrayFromString(password,passwordArray);
        guessArray=new ArrayMaker().makeArrayFromString(guessInput,guessArray);

        bulls=new ArrayMaker().checkForBulls(passwordArray,guessArray);
        cows=new ArrayMaker().checkForCows(passwordArray,guessArray);

        System.out.println("liczba byków: "+bulls+" cows "+cows);







    }


}
class ArrayMaker{


  public int[] makeArrayFromString(String string,int[] array){

        for (int i=0;i<array.length;i++){
            array[i]=Integer.parseInt(string.substring(i,i+1));
        }
        return array;
    }
  public int checkForBulls (int[] password,int[] guess){
      int bulls=0;
      for (int i=0; i< password.length;i++){
          if (password[i]==guess[i]){
              bulls++;
          }
      }
      return bulls;
    }


  public int checkForCows (int[] password,int[] guess){
        int cows=0;

        for (int i=0; i< password.length;i++){

            for(int j=0; j< password.length;j++){
                if(password[i]==guess[j]){
                    cows++;
                    break;

                }
            }

        }
        return cows;
    }


}
