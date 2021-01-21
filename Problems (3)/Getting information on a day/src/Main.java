import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String inputDate = sc.next();

        LocalDate ourDate = LocalDate.parse(inputDate);



        System.out.println(ourDate.getDayOfYear()+" "+ourDate.getDayOfMonth());

    }
}