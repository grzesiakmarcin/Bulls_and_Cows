import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int mont = sc.nextInt();


        LocalDate one = LocalDate.of(year, mont, 1);
        LocalDate letsFindMonday = one;
        LocalDate firstMonday = letsFindMonday;

        for (int i = 0; i < 7; i++) {
            if (String.valueOf(letsFindMonday.getDayOfWeek()).equals("MONDAY")) {
                firstMonday = letsFindMonday;
                break;
            }

           letsFindMonday= letsFindMonday.plusDays(1);
        }

        for (int i=0 ;i<6;i++){
            if(firstMonday.getMonthValue()==mont) {
                System.out.println(firstMonday);
               firstMonday= firstMonday.plusDays(7);
            }


        }



    }

}