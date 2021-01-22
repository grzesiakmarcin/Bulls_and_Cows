import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array = sc.nextLine().split(" ");


        LocalDateTime ourDate = LocalDateTime.parse(array[0]);
        int days = Integer.parseInt(array[1]);
        int hours = Integer.parseInt(array[2]);



        System.out.println(ourDate.plusDays(days).minusHours(hours));

    }
}