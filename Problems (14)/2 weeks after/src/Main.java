import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);


        System.out.println(LocalDate.parse(sc.next()).plusDays(14));


    }
}