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
public abstract class GeometricObject {

    private String color;
    private boolean isfilled;

    public GeometricObject(String color, boolean isfilled) {
        this.color = color;
        this.isfilled = isfilled;
    }

    public String getColor() {
        return color;
    }

    public boolean isIsfilled() {
        return isfilled;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

}
