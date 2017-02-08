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
 import java.util.Scanner;
public class ASH516 {
  public static void main (String[] args)
  {
    java.util.Scanner scan = new java.util.Scanner(System.in);
    System.out.println("enter the number:");
    int N = scan.nextInt();
    
    for (int i =2;N>1;i++)
    {
      if(N%i == 0)
      {
        System.out.print(i +" ");
        
      N/=i;
      i=1;
      }
    }
  }
}


