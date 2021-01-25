import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       String stringus = sc.next();
       int godzina = sc.nextInt();
       int minut= sc.nextInt();

        LocalTime result =LocalTime.parse(stringus).minusHours(godzina).minusMinutes(minut);

        System.out.println(result);

    }
}