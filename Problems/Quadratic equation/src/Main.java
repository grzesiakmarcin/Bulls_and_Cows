import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double determinantValue= (b*b)-(4*a*c);
        double sqrt = Math.sqrt(determinantValue);

        double firstRoot = (-b + sqrt)/(2*a);
        double secondRoot = (-b - sqrt)/(2*a);

        System.out.println(Math.min(firstRoot,secondRoot)+" "+Math.max(firstRoot,secondRoot));



    }
}