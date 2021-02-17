package bullscows;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Jumanji playMe = new Jumanji();
        playMe.puszczamyGre();


    }
}

class Bebechy {

    public void tryToGuessPass(String realPass, String guessPass, int passLength) {

       // System.out.println("hasło do odgadnięcia: "+realPass);

        Scanner sc = new Scanner(System.in);

        String anotherGuess = "";

        int bulls = 0;
        int cows = 0;

        int[] passNumberArray = new int[passLength];
        int[] guessSecretArray = new int[passLength];

        passNumberArray = new ArrayMaker().makeArrayFromInt(passNumberArray, Integer.parseInt(realPass));
        guessSecretArray = new ArrayMaker().makeArrayFromString(guessSecretArray, guessPass);

        bulls = new Bebechy().checkForBulls(passNumberArray, guessSecretArray);
        cows = new Bebechy().checkForCows(passNumberArray, guessSecretArray);


        if (cows > 0 && bulls == 0) {
            System.out.println("Grade: " + cows + " cow(s). The secret code is " + realPass + ".");
        } else if (cows == 0 && bulls > 0) {
            System.out.println("Grade: " + bulls + " bull(s). The secret code is " + realPass + ".");
        } else if (cows > 0 && bulls > 0) {
            System.out.println("Grade: " + bulls + " bull(s) and " + cows + " cow(s).");
        } else if (cows == 0 && bulls == 0) {
            System.out.println("Grade: None. The secret code is " + realPass + ".");
        }

        while (bulls != passLength) {
            System.out.println("Spróbuj ponownie zgadnąc hasło:");
            anotherGuess = sc.next();


            int[] anotherPassNumberArray = new int[realPass.length()];
            int[] anotherGuessSecretArray = new int[anotherGuess.length()];

            passNumberArray = new ArrayMaker().makeArrayFromInt(passNumberArray, Integer.parseInt(realPass));
            guessSecretArray = new ArrayMaker().makeArrayFromInt(anotherGuessSecretArray, Integer.parseInt(anotherGuess));


            bulls = new Bebechy().checkForBulls(passNumberArray, anotherGuessSecretArray);
            cows = new Bebechy().checkForCows(passNumberArray, anotherGuessSecretArray);

            if (cows > 0 && bulls == 0) {
                System.out.println("Grade: " + cows + " cow(s).");
            } else if (cows == 0 && bulls > 0) {
                System.out.println("Grade: " + bulls + " bull(s).");
            } else if (cows > 0 && bulls > 0) {
                System.out.println("Grade: " + bulls + " bull(s) and " + cows + " cow(s).");
            } else if (cows == 0 && bulls == 0) {
                System.out.println("Grade: None.");
            }

        }

        System.out.println("You win :)");

    }

//
//    public String generatePasswordWithProvidedLength(int length) {
//        String answer = "";
//        switch (length) {
//            case 1:
//                answer = String.valueOf(charCyfraRoznaOdZera());
//                break;
//            case 2:
//                answer = generujPass(2);
//                break;
//            case 3:
//                answer = generujPass(3);
//                break;
//            case 4:
//                answer = generujPass(4);
//                break;
//            case 5:
//                answer = generujPass(5);
//                break;
//            case 6:
//                answer = generujPass(6);
//                break;
//            case 7:
//                answer = generujPass(7);
//                break;
//            case 8:
//                answer = generujPass(8);
//                break;
//            case 9:
//                answer = generujPass(9);
//                break;
//            case 10:
//                answer = generujPass(10);
//                break;
//            default:
//                answer = "Error: can't generate a secret number with a length of " + String.valueOf(length) + " because there aren't enough unique digits.";
//                break;
//
//        }
//        return answer;
//
//    }


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


//    public int pass1to10digits(int input) {
//        Scanner sc = new Scanner(System.in);
//        int result = input;
//
//        if (input > 10) {
//            System.out.println("Error: can't generate a secret number with a length of " + input + " because there aren't enough unique digits.");
//            System.out.println("Try again");
//            int anotherTry = sc.nextInt();
//            System.out.println("odpalam rekurencje: 3, 2, 1!");
//            pass1to10digits(anotherTry);
////        }
////        else {
////            result = input;
////        }
//
////        while()
//
//
//        return result;
//
//    }

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


        for (int i = 0; i < password.length; i++) {
            if (guess[i] == password[i]) {
                //bullCount++;
                continue;
            }
            for (int j = 0; j < password.length; j++) {
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


    public int[] makeArrayFromString( int[] array,String string) {

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
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj długość hasła");

        int passLength = sc.nextInt();

        do {
            if (passLength > 10) {
                System.out.println("Error: can't generate a secret number with a length of "+ passLength+" because there aren't enough unique digits. \n" +
                        "Try again");
                passLength = sc.nextInt();
            }
        } while (passLength > 10);


        String realPass = new Bebechy().generujPass(passLength);

        System.out.println("Zgaduj hasło:");
        String guessPass = sc.next();

        new Bebechy().tryToGuessPass(realPass, guessPass, passLength);


    }
}


