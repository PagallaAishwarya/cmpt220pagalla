/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

/**
 *
 * @author aishw
 */
public class TRIANGLE {

    private double side1;
    private double side2;
    private double side3;


    public TRIANGLE(double side1, double side2, double side3) throws IllegalTRIANGLEException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        isValidTRIANGLE();
    }

    public TRIANGLE() {
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
    }

    public double getArea() {

        double s = (side1 + side2 + side3) / 2.0;
        return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
    }

	// JA: You are not extending any class
//    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

//    @Override
    public String toString() {
        return "TRIANGLE{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }

    public static boolean isTRIANGLE(double side1, double side2, double side3) {

        return  ((side1 + side2 > side3) &&
                (side1 + side3 > side2) &&
                (side3 + side2 > side1));

    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) throws IllegalTRIANGLEException {
        this.side1 = side1;
        isValidTRIANGLE();
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) throws IllegalTRIANGLEException{
        this.side2 = side2;
        isValidTRIANGLE();
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) throws IllegalTRIANGLEException {
        this.side3 = side3;
        isValidTRIANGLE();
    }

    private void isValidTRIANGLE() throws IllegalTRIANGLEException{
        if (!isTRIANGLE(side1, side2, side3)) {
            throw new IllegalTRIANGLEException(side1, side2, side3);
        }
    }

    public class IllegalTRIANGLEException extends IllegalArgumentException {

        private double s1;
        private double s2;
        private double s3;

         public IllegalTRIANGLEException(double s1, double s2, double s3) {
            super("Not a real triangle:" + " side1 = " + s1 + " side2 = " + s2 + " side3 = " + s3);
            this.s1 = s1;
            this.s2 = s2;
            this.s3 = s3;
        }

        public double getS1() {
            return s1;
        }

        public double getS2() {
            return s2;
        }

        public double getS3() {
            return s3;

        }
    }
    }



    

