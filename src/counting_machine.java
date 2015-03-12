/**
 * Created by c4q-vanice on 3/10/15.
 */

import java.util.Scanner;

public class counting_machine {
    public static void main (String[] args){
        int number, number2, number3;
        int i;
        Scanner input = new Scanner(System.in);

        System.out.println("Give me three numbers. One to start, one to end and one to count by...");

        System.out.println("What is your first number?");
        number = input.nextInt();

        System.out.println("Thank you. Your second number?");
        number2 = input.nextInt();

            System.out.println("Thank you. What is your last number?");

        number3 = input.nextInt();

        for (i = number; i <= number2; i += number3)

        {
            System.out.println(i);
        }

    }
}
