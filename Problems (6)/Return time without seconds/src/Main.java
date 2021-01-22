import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        String [] input = sc.next().split(":");

        System.out.println(LocalTime.of(Integer.parseInt(input[0]),Integer.parseInt( input[1])));
    }
}