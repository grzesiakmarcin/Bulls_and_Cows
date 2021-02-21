package bullscows;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        Jumanji playMe = new Jumanji();
        playMe.letsPlayAGame();


    }
}

class Bebechy {

    public void tryToGuessPass(String realPass, String guessPass, int passLength) {

        // System.out.println("hasło do odgadnięcia: "+realPass);

        Scanner sc = new Scanner(System.in);

        String anotherGuess = "";

        int bulls = 0;
        int cows = 0;

        String[] passNumberArray = new String[passLength];
        String[] guessSecretArray = new String[passLength];

        passNumberArray = new ArrayMaker().makeArrayFromString(passNumberArray, realPass);
        guessSecretArray = new ArrayMaker().makeArrayFromString(guessSecretArray, guessPass);

        bulls = new Bebechy().checkForBulls(passNumberArray, guessSecretArray);
        cows = new Bebechy().checkForCows(passNumberArray, guessSecretArray);


        if (cows > 0 && bulls == 0) {
            System.out.println("Grade: " + cows + " cow(s). The secret code is " + realPass + ".");
        } else if (cows == 0 && bulls > 0) {
            System.out.println("Grade: " + bulls + " bull(s). The secret code is " + realPass + ".");
        } else if (cows > 0 && bulls > 0) {
            System.out.println("Grade: " + bulls + " bull(s) and " + cows + " cow(s)."+realPass);
        } else if (cows == 0 && bulls == 0) {
            System.out.println("Grade: None. The secret code is " + realPass + ".");
        }

        while (bulls != passLength) {
            // System.out.println("Spróbuj ponownie zgadnąc hasło:");
            anotherGuess = checkTheGuessPassLength(passLength);


            String[] anotherPassNumberArray = new String[realPass.length()];
            String[] anotherGuessSecretArray = new String[anotherGuess.length()];

            passNumberArray = new ArrayMaker().makeArrayFromString(passNumberArray, realPass);
            guessSecretArray = new ArrayMaker().makeArrayFromString(anotherGuessSecretArray, anotherGuess);


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


    public String generujPass(int howManyDigits, int howManySymbols) {

//        if(howManyDigits<10){
//        return generatePassLessThatTenDigit(howManyDigits);
//
//        }
//        else
        return generujPassAllCharacters(howManyDigits, howManySymbols);


    }

    public String generatePassLessThatTenDigit(int howManyDigits) {
        StringBuilder sb = new StringBuilder();
        LinkedHashSet<Character> thisSet = new LinkedHashSet<Character>();


        if (thisSet.isEmpty()) {
            thisSet.add(generateDigitDifferentFromZero());
        }

        while (howManyDigits > thisSet.size()) {
            thisSet.add(generateCharRandomNumber());
        }

        for (Character element : thisSet) {
            sb.append(element);

        }

        return sb.toString();
    }


    public String generujPassAllCharacters(int howManyDigits, int howManySymbols) {
        StringBuilder sb = new StringBuilder();
        LinkedHashSet<Character> thisSet = new LinkedHashSet<>();


        while (howManyDigits > thisSet.size()) {
            thisSet.add(generateLatinLettersAndDigitPass(howManySymbols));
        }

        for (Character element : thisSet) {
            sb.append(element);

        }


        return sb.toString();
    }


//
//
//    public int cyfraRoznaOdZera() {
//        Random cyfra = new Random();
//        int randomDigit = 0;
//
//        while (randomDigit == 0) {
//            randomDigit = cyfra.nextInt(10);
//        }
//
//        return randomDigit;
//    }
//
//
//    public int cyfralosowa() {
//        return new Random().nextInt(10);
//    }


    public char generateDigitDifferentFromZero() {
        Random cyfra = new Random();
        int randomDigit = 0;

        while (randomDigit == 0) {
            randomDigit = cyfra.nextInt(10);
        }

        char[] tablica = String.valueOf(randomDigit).toCharArray();

        return tablica[0];

//       char result ='0';
//
//       while(result=='0'){
//           result=superMetoda();
//       }
//       return result;
    }


    public char generateCharRandomNumber() {
        int digit = new Random().nextInt(10);

        char[] tab = String.valueOf(digit).toCharArray();

        return tab[0];


    }

    public char generateLatinLettersAndDigitPass(int howManySymbols) {
        Random rd = new Random();
        String abc = "0123456789abcdefghijklmnopqrstuvwxyz";//36

        char[] array = abc.toCharArray();
        return abc.charAt(rd.nextInt(howManySymbols));

    }


    public int checkForBulls(String[] password, String[] guess) {
        int bulls = 0;
        for (int i = 0; i < password.length; i++) {
            if (password[i].equals(guess[i])) {
                bulls++;
            }
        }
        return bulls;
    }


    public int checkForCows(String[] password, String[] guess) {
        int cows = 0;


        for (int i = 0; i < password.length; i++) {
            if (guess[i].equals(password[i])) {
                //bullCount++;
                continue;
            }
            for (int j = 0; j < password.length; j++) {
                if (guess[i].equals(password[j])) {
                    cows++;
                }
            }
        }

        return cows;
    }

    public String checkTheGuessPassLength(int passLenght) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Now try to guess the password:");
        String guessPass = sc.next();
        while (guessPass.length() != passLenght) {
            System.out.println("You provided " + guessPass.length() + " character long pass. \nPlease provide " + passLenght + " character long pass.");
            guessPass = sc.next();
        }

        return guessPass;
    }


    public int checkTheProvidedSymbolNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of possible symbols in the code:");
        int provided = sc.nextInt();
        while (provided < 0 || provided > 36) {
            System.out.println("I'm afraid the You number has to be grater than 0, less than 37 \nPlease try again");
            provided = sc.nextInt();
        }

        return provided;
    }

    public String printStars(int passLenght, int howManySymbols) {
        StringBuilder sb = new StringBuilder("The secret is prepared: ");
        String result = "";

        String abc = "0123456789abcdefghijklmnopqrstuvwxyz";
        char[] array = abc.toCharArray();

        for (int i = 0; i < passLenght; i++) {
            sb.append("*");
        }
        sb.append(" (");
        String lastSymbol = String.valueOf(array[howManySymbols - 1]);

        if (howManySymbols <= 10) {
            sb.append("0-" + lastSymbol + ").");
        } else if (howManySymbols > 10) {
            sb.append("0-9,a-" + lastSymbol + ").");
        }

        return String.valueOf(sb);
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


    public String[] makeArrayFromString(String[] array, String string) {

        for (int i = 0; i < array.length; i++) {
            array[i] = string.substring(i, i + 1);
        }
        return array;
    }


}


class Jumanji {
    public void letsPlayAGame() {

        Bebechy bb = new Bebechy();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the length of the secret code:");

        int passLength = sc.nextInt();

        do {
            if (passLength > 36) {
                System.out.println("Error: can't generate a secret number with a length of " + passLength + " because there aren't enough unique digits. \n" +
                        "Try again");
                passLength = sc.nextInt();
            }
        } while (passLength > 36);


        int howManySymbols = bb.checkTheProvidedSymbolNumber();

        String realPass = bb.generujPass(passLength, howManySymbols);
        System.out.println(bb.printStars(passLength, howManySymbols));

        String guessPass = bb.checkTheGuessPassLength(passLength);
        bb.tryToGuessPass(realPass, guessPass, passLength);


    }
}


