/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author aishw
 */
 public class MyInt {

    private int value;

    public MyInt(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return !isEven();
    }

    public boolean isPrime() {
        double range = Math.sqrt(value);
        for (int i = 2; i < range; i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return !isEven(value);
    }

    public static boolean isPrime(int value) {
        double range = Math.sqrt(value);

        for (int i = 2; i < range; i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(MyInt myInteger) {
        return myInteger.isEven();
    }

    public static boolean isOdd(MyInt myInteger) {
        return myInteger.isOdd();
    }

    public static boolean isPrime(MyInt myInteger) {
        return myInteger.isPrime();
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInt myInteger) {
        return this.value == myInteger.value;
    }

    public static int parseInt(char[] value) {

        double valueDouble = 0;
        int toPower = value.length - 1;
        for (char aValue : value) {

            valueDouble += Math.pow(10, toPower--) * (aValue - '0');
        }

        return (int)valueDouble;
    }

    public static int parseInt(String value) {

        return MyInt.parseInt(value.toCharArray());
    }
}



