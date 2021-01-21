import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int month = sc.nextInt();


        LocalDate one = LocalDate.of(year, month, 1);
        LocalDate letsFindMonday = one;
        LocalDate firstMonday = letsFindMonday;

        for (int i = 0; i < 7; i++) {
            if (letsFindMonday.getDayOfWeek()==DayOfWeek.MONDAY) {
                firstMonday = letsFindMonday;
                break;
            }

           letsFindMonday= letsFindMonday.plusDays(1);
        }

        for (int i=0 ;i<6;i++){
            if(firstMonday.getMonthValue()==month) {
                System.out.println(firstMonday);
               firstMonday= firstMonday.plusDays(7);
            }


        }

/*
w alternatywnej wirtualnej rzeczywistosci znalazlem kod który bardzo mi się podoba

        while (letsFindMonday.getMonthValue() == month) {
            if (letsFindMonday.getDayOfWeek() != DayOfWeek.MONDAY) {
                letsFindMonday = letsFindMonday.plusDays(1);
                continue;
            }

            System.out.println(letsFindMonday);
            letsFindMonday = letsFindMonday.plusDays(7);
        }

*/




    }

}