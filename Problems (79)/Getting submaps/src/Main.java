import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int range1= sc.nextInt();
        int range2= sc.nextInt();

        int howManyPairs = sc.nextInt();


        Map<Integer, String> myMap = new TreeMap<>();

        for (int i =0; i<howManyPairs;i++){
            int key= sc.nextInt();
            String value = sc.next();
            myMap.put(key,value);
        }


        for (Map.Entry<Integer,String> element : myMap.entrySet()){
            if(element.getKey()>=range1 && element.getKey()<=range2) {
                System.out.println(element.getKey() + " " + element.getValue());
            }
        }



    }
}