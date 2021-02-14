import java.util.*;

class SetUtils {

    public static Set<Integer> getSetFromString(String str) {
        Set<Integer> mySet = new TreeSet<>();

        String [] array=new String[str.split(" ")];


       return mySet;

    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        for (Integer element : set) {
            if (element > 10) {
                set.remove(element);
            }

        }
    }

}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        Set<Integer> set = SetUtils.getSetFromString(numbers);
        SetUtils.removeAllNumbersGreaterThan10(set);
        set.forEach(e -> System.out.print(e + " "));
    }
}