package bullscows;

import java.awt.image.AreaAveragingScaleFilter;
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

    public int generuj (boolean[] tablica,int pozycja){
        int x = cyfraRoznaOdZera();

        if (tablica[x]= true){
            generuj(tablica, pozycja);
        }


        return x;

    }


    public int cyfraRoznaOdZera() {
        Random cyfra = new Random();
        int randomDigit = 0;

        while (randomDigit == 0) {
            randomDigit = cyfra.nextInt(10);
        }

        return randomDigit;
    }
    public char charCyfraRoznaOdZera() {
        Random cyfra = new Random();
        int randomDigit = 0;

        while (randomDigit == 0) {
            randomDigit = cyfra.nextInt(10);
        }

        char[] tablica = String.valueOf(randomDigit).toCharArray();

        return tablica[0];
    }

    public int cyfralosowa() {
        return new Random().nextInt(10);
    }


    public int rekurencja(int input) {
        int losuj = cyfralosowa();

        if (losuj == input) {
            rekurencja(input);
        }

        return losuj;
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


