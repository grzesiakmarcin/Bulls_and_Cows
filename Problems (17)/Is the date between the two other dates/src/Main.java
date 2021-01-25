import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        LocalDate x = LocalDate.parse(sc.next());
        LocalDate m = LocalDate.parse(sc.next());
        LocalDate n = LocalDate.parse(sc.next());
        boolean answer=false;

        if(x.isAfter(m)&& x.isBefore(n)||
           x.isAfter(n)&& x.isBefore(m)   ){
            answer = true;
        }

        System.out.println(answer);

    }
}