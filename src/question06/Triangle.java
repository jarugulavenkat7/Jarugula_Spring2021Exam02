/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class Triangle extends GeometricObject {
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide, String color, boolean isfilled) {
        super(color, isfilled);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

   
    

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }
    

    @Override
    public double calculateArea() {
        double s =(this.firstSide+this.secondSide+this.thirdSide)/2;
        return Math.sqrt(s*(s-this.firstSide)*(s-this.secondSide)*(s-this.thirdSide));
    }

    @Override
    public double calculatePerimeter() {
        return this.firstSide+this.secondSide+this.thirdSide;
    }

    @Override
    public String toString() {
        return  "\n*************** Details of Triangle ***************"+
                "\nArea of the Triangle      : "+ this.calculateArea()+
                "\nPerimeter of the Triangle : "+ this.calculatePerimeter()+
                "\nColor of the Triangle     : "+ this.getColor()+
                "\nTriangle is filled        : "+ this.isIsfilled()+
                "\n***************************************************";
    }
    
}
