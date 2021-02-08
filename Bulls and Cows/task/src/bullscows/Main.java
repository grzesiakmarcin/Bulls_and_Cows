package bullscows;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int passLength = sc.nextInt();
        if (passLength > 10) {
            System.out.println("Error: can't generate a secret number with a length of 11 because" +
                    " there aren't enough unique digits.");
            System.exit(1);
        } else
            System.out.println("Trwa generowanie hasla\n Podaj swój typ:");


    }
}

class Game {

    public String passsssssGenerator(int passLenght) {

        String rezultat = "";

        switch (passLenght) {
            case 1:
                rezultat = String.valueOf(new ArrayMaker().cyfraRoznaOdZera());
                break;
            case 2:

                break;

            case 3:
                break;

            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;

        }

        return rezultat;
    }


    public int checkForBulls(int[] password, int[] guess) {
        int bulls = 0;
        for (int i = 0; i < password.length; i++) {
            if (password[i] == guess[i]) {
                bulls++;
            }
        }
        return bulls;
    }


    public int checkForCows(int[] password, int[] guess) {
        int cows = 0;


        for (int i = 0; i < 4; i++) {
            if (guess[i] == password[i]) {
                //bullCount++;
                continue;
            }
            for (int j = 0; j < 4; j++) {
                if (guess[i] == password[j]) {
                    cows++;
                }
            }
        }

        return cows;
    }



    public int[] case5(){
        int[] haslo = {0,0,0,0,0};
        haslo[0]=new ArrayMaker().cyfraRoznaOdZera

        for (int i=1; i<5;i++){


        }




    return haslo;
}

class ArrayMaker {

    public int[] makeArrayFromInt(int[] array, int sas) {

        String robimyStirnga = String.valueOf(sas);

        for (int i = 0; i < array.length; i++) {
            array[i] = robimyStirnga.charAt(i);

        }
        return array;
    }


    public int[] makeArrayFromString(String string, int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(string.substring(i, i + 1));
        }
        return array;
    }

    public int[] makeArrayFromString(StringBuilder string, int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(string.substring(i, i + 1));
        }
        return array;
    }


    public int cyfraRoznaOdZera() {
        Random cyfra = new Random();
        int randomDigit = 0;

        while (randomDigit == 0) {
            randomDigit = cyfra.nextInt(10);
        }

        return randomDigit;
    }

    public int cyfralosowa() {
        return new Random().nextInt(10);
    }

    public int rekurencja(int input){
       int losuj = cyfralosowa();

        if (losuj==input){rekurencja(input);}


            return losuj;
    }

    }



}

class Jumanji {
    public void puszczamyGre() {
        int guessPass = sc.nextInt();
        int[] secretNumberArray = new int[passLength];
        int[] guessSecretArray = new int[passLength];

        secretNumberArray = new ArrayMaker().makeArrayFromInt(secretNumberArray, pass);
        guessSecretArray = new ArrayMaker().makeArrayFromInt(guessSecretArray, guessPass);

        int bulls = 0;
        int cows = 0;

        bulls = new Game().checkForBulls(secretNumberArray, guessSecretArray);
        cows = new Game().checkForCows(secretNumberArray, guessSecretArray);


        if (cows > 0 && bulls == 0) {
            System.out.println("Grade: " + cows + " cow(s). The secret code is " + pass + ".");
        } else if (cows == 0 && bulls > 0) {
            System.out.println("Grade: " + bulls + " bull(s). The secret code is " + pass + ".");
        } else if (cows > 0 && bulls > 0) {
            System.out.println("Grade: " + bulls + " bull(s) and " + cows + " cow(s). The secret code is " + pass + ".");
        } else if (cows == 0 && bulls == 0) {
            System.out.println("Grade: None. The secret code is " + pass + ".");
        }
    }
}


