package bullscows;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int pass = new Game().generatePassword();
        System.out.println("Trwa generowanie hasla\n Podaj swój typ:");
        System.out.println("Wygenerowano: "+pass);
        System.out.println("zgaduj hasło");

        int guessPass = sc.nextInt();
        int[] secretNumberArray= new int[4];
        int[] guessSecretArray=new int[4];

        secretNumberArray=new ArrayMaker().makeArrayFromInt(secretNumberArray,pass);
        guessSecretArray=new ArrayMaker().makeArrayFromInt(guessSecretArray,guessPass);

        int bulls=0;
        int cows=0;

        bulls=new Game().checkForBulls(secretNumberArray,guessSecretArray);
        cows=new Game().checkForCows(secretNumberArray,guessSecretArray);



        if(cows>0 && bulls ==0){System.out.println("Grade: "+cows+" cow(s). The secret code is "+pass+".");}
        else if(cows==0 && bulls>0){System.out.println("Grade: "+bulls+" bull(s). The secret code is "+pass+".");}
        else if(cows >0 && bulls>0) {System.out.println("Grade: " + bulls + " bull(s) and " + cows + " cow(s). The secret code is " + pass + ".");}
        else if(cows==0 && bulls==0){System.out.println("Grade: None. The secret code is "+pass+".");}






    }
}

class Game{

    public int generatePassword (){
        Random random = new Random();

        int pass = random.nextInt(10000);

        while (pass < 999) {
            pass = random.nextInt(10000);
        }


        return pass;

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


        if(guess[0]==password[1]||guess[0]==password[2]||guess[0]==password[3]){cows++;}
        if(guess[1]==password[0]||guess[1]==password[2]||guess[1]==password[3]){cows++;}
        if(guess[2]==password[0]||guess[2]==password[1]||guess[2]==password[3]){cows++;}
        if(guess[3]==password[1]||guess[3]==password[2]||guess[3]==password[0]){cows++;}
        return cows;
    }
}

    //int pass = 1234;


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

//        Gra myGame = new Gra();
//        myGame.mainOfGame();



//}
//class Gra{
//    public void mainOfGame(){
//
//        int bulls=0;
//        int cows =0;
//
//        Scanner sc = new Scanner(System.in);
//
//        Random random = new Random();
//
//        String generateSecretCode = String.format("%04d", random.nextInt(10000));
//
//        System.out.println("hasło to :" + generateSecretCode);
//
//
//        do{
//        System.out.println("zgaduj hasło");
//        String guessInput=sc.next();
//
//        int[] passwordArray= new int[4];
//        int[] guessArray= new int [4];
//
//
//
//        //passwordArray=new ArrayMaker().makeArrayFromString(password,passwordArray);
//
//        passwordArray=new ArrayMaker().makeArrayFromString(String.valueOf(generateSecretCode),passwordArray);
//        guessArray=new ArrayMaker().makeArrayFromString(guessInput,guessArray);
//
//        bulls=new ArrayMaker().checkForBulls(passwordArray,guessArray);
//        cows=new ArrayMaker().checkForCows(passwordArray,guessArray);
//
//        System.out.println("liczba byków: "+bulls+" cows "+cows);}
//        while (bulls == 4);
//
//
//
//
//
//
//
//    }


//}
class ArrayMaker{

    public int[]  makeArrayFromInt(int[] array, int sas){

        String robimyStirnga = String.valueOf(sas);

        for (int i =0; i<array.length;i++){
            array[i]=robimyStirnga.charAt(i);

        }
        return  array;
    }


  public int[] makeArrayFromString(String string,int[] array){

        for (int i=0;i<array.length;i++){
            array[i]=Integer.parseInt(string.substring(i,i+1));
        }
        return array;
    }




}
