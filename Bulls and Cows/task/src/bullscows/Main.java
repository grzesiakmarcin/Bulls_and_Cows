package bullscows;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj długość hasła");
        int passLength = sc.nextInt();
        String pass = new Bebechy().generatePasswordWithProvidedLength(passLength);
        System.out.println(pass);

//        System.out.println("Trwa generowanie hasla\n Podaj swój typ:");
//        String guessPass = sc.next();
//
//        Jumanji playMe = new Jumanji();
//        playMe.puszczamyGre(pass, guessPass);


    }
}

class Bebechy {


    public String generatePasswordWithProvidedLength(int length) {
        String answer = "";
        switch (length) {
            case 1:
                answer = String.valueOf(charCyfraRoznaOdZera());
                break;
            case 2:
                answer = generujPass(2);
                break;
            case 3:
                answer = generujPass(3);
                break;
            case 4:
                answer = generujPass(4);
                break;
            case 5:
                answer = generujPass(5);
                break;
            case 6:
                answer = generujPass(6);
                break;
            case 7:
                answer = generujPass(7);
                break;
            case 8:
                answer = generujPass(8);
                break;
            case 9:
                answer = generujPass(9);
                break;
            case 10:
                answer = generujPass(10);
                break;
            default:
                answer = "Error: can't generate a secret number with a length of "+String.valueOf(length)+" because there aren't enough unique digits.";
                break;

        }
        return answer;

    }


    public String generujPass(int howManyDigits) {
        StringBuilder sb = new StringBuilder();
        LinkedHashSet<Character> thisSet = new LinkedHashSet<Character>();


        if (thisSet.isEmpty()) {
            thisSet.add(charCyfraRoznaOdZera());
        }

        while (howManyDigits > thisSet.size()) {
            thisSet.add(charCyfralosowa());
        }

        for (Character element : thisSet) {
            sb.append(element);

        }

        return sb.toString();
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


    public char charCyfraRoznaOdZera() {
        Random cyfra = new Random();
        int randomDigit = 0;

        while (randomDigit == 0) {
            randomDigit = cyfra.nextInt(10);
        }

        char[] tablica = String.valueOf(randomDigit).toCharArray();

        return tablica[0];
    }


    public char charCyfralosowa() {
        int digit = new Random().nextInt(10);

        char[] tab = String.valueOf(digit).toCharArray();

        return tab[0];

    }


//    public int rekurencja(int input) {
//        int losuj = cyfralosowa();
//
//        if (losuj == input) {
//            rekurencja(input);
//        }
//
//        return losuj;
//    }

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
    public void puszczamyGre(String pass, String guessPass) {

        int[] secretNumberArray = new int[pass.length()];
        int[] guessSecretArray = new int[guessPass.length()];

        secretNumberArray = new ArrayMaker().makeArrayFromInt(secretNumberArray, Integer.parseInt(pass));
        guessSecretArray = new ArrayMaker().makeArrayFromInt(guessSecretArray, Integer.parseInt(guessPass));

        int bulls = 0;
        int cows = 0;

        bulls = new Bebechy().checkForBulls(secretNumberArray, guessSecretArray);
        cows = new Bebechy().checkForCows(secretNumberArray, guessSecretArray);


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


