import java.util.Scanner;

public class Evennumbers {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter positive integer: ");
        int input = kbd.nextInt();
        int  sum = 0;
        for(int i = 1; i <= input; i++) {
            if (i % 2 ==0){

                sum = sum + i;

            }


        }
        System.out.println("The sum of all even integer between 1 and " + input + " Is " + sum);
    }
}

