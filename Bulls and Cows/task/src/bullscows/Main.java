package bullscows;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int pass = new Game().generatePassword();
        System.out.println("Trwa generowanie hasla\n Podaj swój typ:");
        //System.out.println("Wygenerowano: "+pass);

        int guessPass = sc.nextInt();
        int[] secretNumberArray = new int[4];
        int[] guessSecretArray = new int[4];

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

class Game {

    public int generatePassword() {
        Random random = new Random();

        int pass = random.nextInt(10000);

        while (pass < 999) {
            pass = random.nextInt(10000);
        }


        return pass;

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


//
//        if(guess[0]==password[1]||guess[0]==password[2]||guess[0]==password[3]){cows++;}
//        if(guess[1]==password[0]||guess[1]==password[2]||guess[1]==password[3]){cows++;}
//        if(guess[2]==password[0]||guess[2]==password[1]||guess[2]==password[3]){cows++;}
//        if(guess[3]==password[1]||guess[3]==password[2]||guess[3]==password[0]){cows++;}
        return cows;
    }
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


}


