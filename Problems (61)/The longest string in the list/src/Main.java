import java.util.*;

public class Main {

    static void changeList(List<String> list) {

        String longest = "";


        for (String element : list) {
            if (element.length() > longest.length()) {
                longest = element;
            }
        }
//
//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, longest);
//        }

        String finalLongest = longest;
        list.replaceAll(e-> finalLongest);
        list.
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}