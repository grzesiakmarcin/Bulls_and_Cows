import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static LocalDateTime merge(LocalDateTime dateTime1, LocalDateTime dateTime2) {

        boolean date = dateTime1.toLocalDate().isAfter(dateTime2.toLocalDate());
        boolean time = dateTime2.toLocalTime().isAfter(dateTime1.toLocalTime());

        LocalDateTime result=dateTime1;


        if(date&&time){ LocalDateTime result = LocalDateTime.of(dateTime1.toLocalDate(),dateTime2.toLocalTime());}


        return result;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final LocalDateTime firstDateTime = LocalDateTime.parse(scanner.nextLine());
        final LocalDateTime secondDateTime = LocalDateTime.parse(scanner.nextLine());
        System.out.println(merge(firstDateTime, secondDateTime));
    }
}