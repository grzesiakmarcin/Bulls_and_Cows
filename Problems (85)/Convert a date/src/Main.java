import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String newInput = sc.next();
        char[] array = newInput.toCharArray();

//        for (int i =0; i< array.length;i++) {
//            System.out.println(array[i]+ "miejsce "+i);
//
//        }
        StringBuilder sb = new StringBuilder();
        sb.append(array[5]);
        sb.append(array[6]);
        sb.append("/");
        sb.append(array[8]);
        sb.append(array[9]);
        sb.append("/");
        sb.append(array[0]);
        sb.append(array[1]);
        sb.append(array[2]);
        sb.append(array[3]);

        System.out.println(sb);

    }
}