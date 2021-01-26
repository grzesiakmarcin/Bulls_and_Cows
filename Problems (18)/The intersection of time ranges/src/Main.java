import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalTime timeOne = LocalTime.parse(sc.next());
        LocalTime timeTwo = LocalTime.parse(sc.next());
        LocalTime timeThree = LocalTime.parse(sc.next());
        LocalTime timeFour = LocalTime.parse(sc.next());

        LocalTime plusOne=timeOne;

        boolean result =false;

        int minutRoznicy = timeTwo.toSecondOfDay()/60 - timeOne.toSecondOfDay()/60;

        for (int i =0; i<=minutRoznicy;i++){


            if(plusOne.isAfter(timeThree.minusMinutes(1))&&
               plusOne.isBefore(timeFour.plusMinutes(1))){
                result=true;
            }
            plusOne=plusOne.plusMinutes(1);

        }

        System.out.println(result);


    }

}