/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question06;

import java.util.Scanner;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first side of a triangle");
        double firstSide = scanner.nextDouble();
         System.out.println("Enter the second side of a triangle");
        double secondSide = scanner.nextDouble();
         System.out.println("Enter the third side of a triangle");
        double thirdSide=scanner.nextDouble();
        System.out.println("Enter the color of the triangle");
        String color = scanner.next();
        System.out.println("Enter whether the triangle is filled or not(true/false)");
        boolean isfilled = scanner.nextBoolean();
        Triangle triangle = new Triangle(firstSide,secondSide,thirdSide,color,isfilled);
        System.out.println(triangle);
        

    }

}
