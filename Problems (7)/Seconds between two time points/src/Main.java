import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        LocalTime firstInput = LocalTime.parse(scanner.next());
        LocalTime secondInput = LocalTime.parse(scanner.next());


        System.out.println(Math.abs(secondInput.toSecondOfDay()-firstInput.toSecondOfDay()));

        LocalDateTime onr = LocalDateTime.MAX;
        System.out.println(onr);

    }
}