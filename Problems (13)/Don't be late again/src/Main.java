import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int howManyShops = sc.nextInt();

       String[][] array = new String[howManyShops][2];//[2][6]  : 2-ilosc wierszy 6-ilosc kolumn


       for (int i=0; i<howManyShops;i++){
           for(int j=0; j<2;j++){
               array[i][j]= sc.next();
           }
       }

        LocalTime deadLine = LocalTime.of(19,30);

       for (int i=0; i<howManyShops;i++){
           for (int j=0; j<2;j++){

           }
       }




//        for (int i=0; i<howManyShops;i++){
//            for(int j=0; j<2;j++){
//                System.out.print(array[i][j]+" ");
//            }
//            System.out.println();
//        }

    }
}