import java.math.BigInteger;

class DoubleFactorial {
    public static BigInteger calcDoubleFactorial(int n) {

//
//        BigInteger result = new BigInteger(String.valueOf(n));
//
//        int cyferka = n - 2;
//
//
//        for (int i = cyferka; i >= 0; i = i - 2) {
//
//            result = result.multiply(new BigInteger(String.valueOf(i)));
//
//        }
//
//
//        if (n == 1|| n==0) {
//            return BigInteger.ONE;
//        } else if (n == 2) {
//            return BigInteger.TWO;
//
//        } else
//            return result;
    }

public static BigInteger doubleFactorial(int m){
        if (m == 0 || m == 1) {
            return BigInteger.ONE;
        } else if (m == 2) {
            return BigInteger.TWO;
        } else {
            return BigInteger(m) factorial(n - 1); // the recursive call
        }
    }



}