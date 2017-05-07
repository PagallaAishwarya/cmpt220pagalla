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
public class ASH1813 {
    

    public static void main(String[] args) {

        int[] array = new int[8];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 8 integers: ");

        for (int i = 0; i < array.length; i++)
            array[i] = input.nextInt();

        System.out.println("The largest number is " + getLargest(array));

    }

    private static int getLargest(int[] array) {

        return getLargest(array, 0, array[0]);
    }

    private static int getLargest(int[] array, int i, int high) {

        if (i == array.length)
            return high;

        if (high < array[i])
            high = array[i];

        return getLargest(array, i + 1, high);
    }


}
  
