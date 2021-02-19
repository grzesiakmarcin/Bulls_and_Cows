import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numberOfRows = sc.nextInt();
        int numberOfCollums = sc.nextInt();

        int [][] array = new int [numberOfRows][numberOfCollums];
        for(int i =0; i<numberOfRows;i++){
            for (int j = 0; j<numberOfCollums;j++){
                array[i][j]=sc.nextInt();
            }
        }

        int distanceOfRorating = sc.nextInt();


    }
}