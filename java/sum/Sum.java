package sum;

import java.util.Scanner;

public class Sum {


    public static void main(String[] args) {
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");

        while(true){

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){
                int number = scanner.nextInt();
                total+=number;
            } else {
                break;
            }

        }
        System.out.println("Result is: "+ total);

    }
}
