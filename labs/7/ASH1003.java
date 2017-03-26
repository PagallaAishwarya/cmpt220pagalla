/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author aishw

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aishw
 */
public class ASH1003 {

    public static void main(String[] args) {

        MyInt num1 = new MyInt(7);
        MyInt num2 = new MyInt(7);
        MyInt num3 = new MyInt(25);

        System.out.printf("Number 1 = %d isPrime: %b isOdd: %b isEven %b\n",
                num1.getValue(), num1.isPrime(), num1.isOdd(), num1.isEven());

        System.out.printf("Number 2 = %d isPrime: %b isOdd: %b isEven %b\n",
                num2.getValue(), num2.isPrime(), num2.isOdd(), num2.isEven());
        System.out.printf("Number 3 = %d isPrime: %b isOdd: %b isEven %b\n",
                num3.getValue(), num3.isPrime(), num3.isOdd(), num3.isEven());

        System.out.printf("Num 1 == Num 2: %b\n", num1.equals(num2));
        System.out.printf("Num 1 == Num 3: %b\n", num1.equals(num3));
        System.out.printf("Parse int 100 string value == %d\n", MyInt.parseInt("100"));
        System.out.printf("Parse int 150 char array value == %d\n", MyInt.parseInt("150".toCharArray()));

    }
}
    

    

