import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       String input = sc.next();

        LocalDate ourStatingDate = LocalDate.parse(input);

        System.out.println(ourStatingDate.minusYears(30)+"\n"+ourStatingDate.plusYears(30) );
    }
}