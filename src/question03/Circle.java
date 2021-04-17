/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getDiameter() {
        return this.radius * 2;
    }

    @Override
    public String toString() {
        return "**************** Circle Details ****************"
                + "\nRadius        : " + String.format("%.2f", this.getRadius()) + "cm"
                + "\nDiameter      : " + String.format("%.2f", this.getDiameter()) + "cm"
                + "\nArea          : " + String.format("%.2f", this.getArea()) + "cm" + "\u00B2"
                + "\nCircumference : " + String.format("%.2f", this.getCircumference()) + "cm";
    }

}
