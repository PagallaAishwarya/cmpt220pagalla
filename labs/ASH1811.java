/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aishw
 */
import java.util.Scanner;
public class ASH1811 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long n = input.nextLong();
        System.out.println(sumDigits(n));

    }

    public static long sumDigits(long n) {

        if (n == 0)
            return n;

        return n % 10 + sumDigits(n / 10);
    }
}
