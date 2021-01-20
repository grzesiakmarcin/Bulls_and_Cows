import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String s[]= sc.nextLine().split(" ");

        BigInteger a = new BigInteger(s[0]);
        BigInteger b = new BigInteger(s[1]);
        BigInteger c = new BigInteger(s[2]);
        BigInteger d = new BigInteger(s[3]);

        System.out.println(a.negate().multiply(b).add(c.subtract(d)));


    }
}