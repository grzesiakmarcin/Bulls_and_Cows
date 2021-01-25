import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalTime time= LocalTime.of(19,30);
        LocalTime deadline = time.plusMinutes(30);
        String[] tablica = new String[2];

        int number = sc.nextInt();

      while (sc.hasNextLine()){
         tablica[0] =sc.next();
         tablica[1] =sc.next();


         LocalTime zczytanaGodzina = LocalTime.parse(tablica[1]);
         if (zczytanaGodzina.isAfter(deadline)){
             System.out.println(tablica[0]);
         }


      }

    }
}