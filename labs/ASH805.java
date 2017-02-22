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
public class ASH805 {
   
 public static void main(String[] args) {
  double[][] x = new double[3][3];
  double[][] y = new double[3][3];
  double[][] result;
 
  java.util.Scanner input = new Scanner(System.in);
  System.out.print("Enter matrix1:");
  for (int i = 0; i < x.length; i++) {
   for (int j = 0; j < x[0].length; j++) {
    x[i][j] = input.nextDouble();
   }
 
  }
 
  System.out.print("Enter matrix2:");
  for (int i = 0; i < y.length; i++) {
   for (int j = 0; j < y[0].length; j++) {
    y[i][j] = input.nextDouble();
   }
 
  }
 
  result = addMatrix(x, y);
 
  // printing
  System.out.println("The matrices are added as follows");
  for (int i = 0; i < result.length; i++) {
   for (int j = 0; j < result[0].length; j++) {
 
    System.out.print(x[i][j] + " ");
    if (i == 1 && j == 2) {
     System.out.print(" + ");
    } else {
     System.out.print("   ");
    }
   }
   for (int j = 0; j < result[0].length; j++) {
    System.out.print(y[i][j] + " ");
    if (i == 1 && j == 2) {
     System.out.print(" = ");
    } else {
     System.out.print("   ");
    }
   }
   for (int j = 0; j < result[0].length; j++) {
    System.out.print(result[i][j] + " ");
   }
   System.out.println();
  }
 
 }
 
 public static double[][] addMatrix(double[][] x, double[][] y) {
  // Check metrix dimension
  if (x.length != y.length || x[0].length != y[0].length)
   return null;
 
  double[][] result = new double[y.length][x[0].length];
 
  for (int i = 0; i < result.length; i++) {
   for (int j = 0; j < result[0].length; j++) {
    result[i][j] = x[i][j] + y[i][j];
   }
 
  }
 
  return result;
 
 }
 
}

