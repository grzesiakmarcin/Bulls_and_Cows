import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        Set<String> mySet = new TreeSet<>();
        while (sc.hasNextLine()) {
            String element = sc.nextLine();
            mySet.add(element);

        }

        for (String stringus : mySet
        ) {
            System.out.println(stringus);

        }


    }
}