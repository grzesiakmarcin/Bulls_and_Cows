import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        Deque<Integer> myQueue = new ArrayDeque<>();
        int size = sc.nextInt();


        while (sc.hasNext()) {
            int nextInt = sc.nextInt();

            if (nextInt % 2 == 0) {
                myQueue.addFirst(nextInt);
            } else if (nextInt % 2 != 0) {
                myQueue.offerLast(nextInt);
            }

        }


//        for (int i = 0; i < size; i++) {
//            System.out.println(myQueue.poll());
//        }

        for ( int i :myQueue
             ) {
            System.out.println(i);

        }


    }
}