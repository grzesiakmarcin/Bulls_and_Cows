import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int lower = scanner.nextInt();
        int upper = scanner.nextInt();
        int ran;
        int result=0;


        Random random = new Random(lower+upper);

        for (int i =0; i<n;i++) {
            ran= random.nextInt(upper-lower+1)+lower;

            result=result+ran;

        }
        System.out.println(result);
    }
}