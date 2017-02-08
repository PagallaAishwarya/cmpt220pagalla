/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASH;

/**
 *
 * @author aishw
 */
public class ASH63 {
    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = (reverse * 10) + number % 10;
            number = number / 10;
        }
        return (reverse);
    }

    public static boolean isPalindrome(int number) {
        return (number == reverse(number));
    }

    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Reversed: " + reverse(number));

        if (number == reverse(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }

    
}
