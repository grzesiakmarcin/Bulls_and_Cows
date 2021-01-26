import java.util.Scanner;

public class Main {

    public static int convert(Long val) {
        int result;

        if (val ==null) {
            result = 0;
        } else if (val < Integer.MIN_VALUE) {
            result = Integer.MIN_VALUE;
        } else if (val>Integer.MAX_VALUE) {
            result = Integer.MAX_VALUE;
        } else {
            result = val.intValue();

        }

        return result;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        Long longVal = "null".equals(val) ? null : Long.parseLong(val);
        System.out.println(convert(longVal));
    }
}