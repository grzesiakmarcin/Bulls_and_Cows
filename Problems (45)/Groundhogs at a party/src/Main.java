import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        boolean result = false;

        if (weekend == true) {
            if (cups >= 15 && cups < 26) {
                result = true;
            }
        } else {
            if (cups >= 10 && cups < 21) {
                result= true;
            }

        }
        System.out.println(result);
    }
}