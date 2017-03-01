/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aishw
 */
public class ASH91 {

    public static void main(String[] args) {


        RECTANGLE[] rectangles = new RECTANGLE[2];
        rectangles[0] = new RECTANGLE(4,40);
        rectangles[1] = new RECTANGLE(3.5, 35.9);

        for (int i = 0; i < 2; i++){
            System.out.println("RECTANGLE " + (i+1) +":");
            System.out.print("Area = " + rectangles[i].getArea());
            System.out.println(" Perimeter = " +  rectangles[i].getPerimeter() +"\n");
        }
    }
}
    

