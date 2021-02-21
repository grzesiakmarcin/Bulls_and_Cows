import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            String input = sc.next();

            if (!input.equals("0")) {

                try {
                    int x = Integer.parseInt(input) * 10;
                    System.out.println(x);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid user input: " + input);
                }


            } else {
                break;
            }


        }

    }
}