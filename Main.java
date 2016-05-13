/**
 * Created by Josue on 4/8/2016.
 * Messing with Arrays and comparison between array elements
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); //Scanner to take user input
        int[] numbers = new int[5];//Pre-initialized array that holds 5 values

        System.out.println("Please Enter 5 numbers, between 10, and 100:");

        for (int i = 0; i < 5; i++) {//for loop to go through all 5 elements of the array
            numbers[i] = keyboard.nextInt();
            while (numbers[i] < 10 || numbers[i] > 100) {//Check to make sure the numbers inputted are between 10 and 100
                System.out.println("Invalid number, it must be a number between 10 and 100, try again: ");
                numbers[i] = keyboard.nextInt();
            }
            for (int a = 0; a < 5; a++) {//nested for loop in order to compare the array element with the rest of the array numbers
                if (numbers[i] == numbers[a] && i != a)//comparing if the number from element i, is the same as element a of the array, and making sure i does not equal a, so it doesn't check the same array
                {
                    System.out.println("This number is repeated, enter it again: ");
                    numbers[i] = keyboard.nextInt();
                    while (numbers[i] == numbers[a]) { //while loop in case the user tried to mess the program, will make sure they don't enter repeated numbers
                        System.out.println("Stop trolling and enter an appropriate numbers");
                        numbers[i] = keyboard.nextInt();
                    }

                }
            }
            // System.out.println("Number " + numbers[i] + " is a valid number");
        }

        System.out.println("The numbers you've inputted are: "); //prints out all the valid numbers in the array
        for (int i = 0; i < 5; i++) {
            System.out.print("\'" + numbers[i] + "\' ");
        }


    }
}
