/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aishw
 */
public class RECTANGLE {
 
    private double width;
    private double height;

    public RECTANGLE() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public RECTANGLE(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height; 
    }

    public double getPerimeter() {
        return this.width * 2 + this.height * 2;
    }

}
 
