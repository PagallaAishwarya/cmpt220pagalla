/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author aishw
 */
 import java.util.Scanner;
public class ASH714 {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int[] numbers = new int[5];
 
  System.out.print("Enter 5 number:");
 
  for (int i = 0; i < numbers.length; i++) {
   numbers[i] = input.nextInt();
  }
 
  System.out.println("The gcd is " + gcd(numbers));
 
 }
  
 //Using Euclidean algorithm recursively 
 
 public static int gcd(int... numbers) {
  int gcd = min(numbers);
 
  for (int i = 0; i < numbers.length; i++) {
 
   if (numbers[i] % gcd == 0) {
    numbers[i] = gcd;
   } else {
    numbers[i] = numbers[i] % gcd;
   }
 
  }
 
  if (gcd == min(numbers)) {
   return gcd;
  }
 
  return gcd(numbers);
 
 }
 
 public static int min(int... numbers) {
 
  int min = numbers[0];
  for (int i = 1; i < numbers.length; i++) {
   if (min > numbers[i]) {
    min = numbers[i];
   }
  }
 
  return min;
 
 }
 
}
    
