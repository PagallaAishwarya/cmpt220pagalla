/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.Scanner;

/**
 *
 * @author aishw
 */
public class ASH1005 {
    public static void main(String[] args) {

        System.out.print("Enter a positive integer: ");
        int num = new Scanner(System.in).nextInt();

        StackOfInt stack = new StackOfInt(20);

        int factor = 2;
        while (factor <= num) {
            if (num % factor == 0) {
                stack.push(factor);
                num /= factor;
            } else {
                factor++;
            }
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }


    }

    
}
