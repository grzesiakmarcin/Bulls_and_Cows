import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        LocalDateTime ourDate =LocalDateTime.parse(sc.next());
        int howManyMin = sc.nextInt();
        ourDate=ourDate.plusMinutes(howManyMin);
        System.out.println(ourDate.getYear()+" " +ourDate.getDayOfYear()+" "+ourDate.toLocalTime());






    }
}