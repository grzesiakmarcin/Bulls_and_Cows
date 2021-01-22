import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        LocalTime firstInput = LocalTime.parse(scanner.next());
        LocalTime secondInput = LocalTime.parse(scanner.next());
//        LocalTime inBetween = LocalTime.



        System.out.println(Math.max(secondInput.toSecondOfDay(),firstInput.toSecondOfDay())-Math.min(secondInput.toSecondOfDay(),firstInput.toSecondOfDay()) );

    }
}