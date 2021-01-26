import java.math.BigInteger;
import java.util.Scanner;

class DoubleFactorial {
    public static BigInteger calcDoubleFactorial(int n) {



        BigInteger m = new BigInteger(String.valueOf(n));
        return liczymy(BigInteger.valueOf(n));


    }

    public static BigInteger liczymy(BigInteger liczba) {
        if (liczba.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        } else if (liczba.equals(BigInteger.ZERO)) {
            return BigInteger.ZERO;

        }

        return new BigInteger(String.valueOf(liczba)).multiply(liczymy(liczba.subtract(BigInteger.TWO)));
    }
}