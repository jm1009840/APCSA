package Chapter03;

import java.util.Scanner;

/**
 * Program finds if a number is a palindrome
 *
 * @author Joseph Mecoy
 */
public class C3_2 {

    /**
     * Main Method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();

        int position1 = number / 100;
        int position3 = number % 10;

        System.out.println(number + (position1 == position3 ? " is " : " is not ") + "a palindrome");
    }
}
