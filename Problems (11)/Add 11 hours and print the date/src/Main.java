import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDateTime input = LocalDateTime.parse(sc.next());

        System.out.println(input.plusHours(11).toLocalDate());

    }
}