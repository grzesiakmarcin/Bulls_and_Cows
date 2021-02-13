import java.util.List;
import java.util.Scanner;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        int wystapieniaList1=0;
        int wystapieniaList2=0;

        boolean result = false;

        for (Integer element:list1) {
            if(element==elem){
                wystapieniaList1++;
            }

        }

        for (Integer element:list2) {
            if(element==elem){
                wystapieniaList2++;
            }

        }


        if(wystapieniaList1==wystapieniaList2){
            result= true;
        }

        return result;
    }
}