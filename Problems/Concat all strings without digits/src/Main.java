import java.util.Scanner;

class ConcatenateStringsProblem {

    public static String concatenateStringsWithoutDigits(String[] strings) {


        StringBuilder sbb = new StringBuilder();
        StringBuilder result = new StringBuilder();


        for (String element : strings) {
            sbb.append(element);
        }

        char[] tablica = sbb.toString().toCharArray();

        for (char element : tablica) {

            if (element != '0' &&
                    element != '1' &&
                    element != '2' &&
                    element != '3' &&
                    element != '4' &&
                    element != '5' &&
                    element != '6' &&
                    element != '7' &&
                    element != '8' &&
                    element != '9' &&
                    element != ' ') {

                result.append(element);
            }


        }


        return result.toString();

//        for (String cosik:strings) {
//            stringBuilder.append(cosik);
//
//        }
//
//
//
//        for (int i=0; i<=stringBuilder.length()-1;i++){
//
//            if (stringBuilder.charAt(i)=='0'||
//                    stringBuilder.charAt(i)=='1'||
//                    stringBuilder.charAt(i)=='2'||
//                    stringBuilder.charAt(i)=='3'||
//                    stringBuilder.charAt(i)=='4'||
//                    stringBuilder.charAt(i)=='5'||
//                    stringBuilder.charAt(i)=='6'||
//                    stringBuilder.charAt(i)=='7'||
//                    stringBuilder.charAt(i)=='8'||
//                    stringBuilder.charAt(i)=='9'||
//                    stringBuilder.charAt(i)==' '){
//
//
//                stringBuilder.replace(i,i+1,"");
//
//            }
//
//
//        }

//        for (int i =0; i<strings.length;i++) {
//
//            if (!strings[i].equals(one)||
//            !strings[i].equals(two)||
//            !strings[i].equals(three)||
//            !strings[i].equals(four)||
//            !strings[i].equals(five)||
//            !strings[i].equals(six)||
//            !strings[i].equals(seven)||
//            !strings[i].equals(eight)||
//            !strings[i].equals(nine)||
//            !strings[i].equals(space)){
//
//                stringBuilder.append(strings[i]);
//
//            }
//        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}