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
public class ASH1815 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.next();
        char ch = input.next().charAt(0);
        System.out.println(count(str, ch));

    }

    public static int count(String s, char ch) {
        return count(s, ch, s.length() - 1);
    }

    public static int count(String s, char ch, int high) {
        int n =  (ch == s.charAt(0)) ? 1 : 0;
        if (high <= 0)
            return n;
        return n + count(s.substring(1), ch, high - 1);
    }
}

