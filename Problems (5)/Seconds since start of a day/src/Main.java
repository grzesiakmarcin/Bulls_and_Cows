import org.w3c.dom.ls.LSOutput;

import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        System.out.println(LocalTime.ofSecondOfDay(input));
    }
}