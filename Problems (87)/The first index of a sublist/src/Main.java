import java.util.*;

class Main {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String[] first = sc.nextLine().split(" ");
        String[] sec = sc.nextLine().split(" ");




        for (int i = 0; i < first.length; i++) {
            lista1.add(Integer.parseInt(first[i]));
        }
        for (int i = 0; i < sec.length; i++) {
            lista2.add(Integer.parseInt(sec[i]));
        }


        System.out.println(Collections.indexOfSubList(lista1, lista2) + " " + Collections.lastIndexOfSubList(lista1, lista2));
    }


}