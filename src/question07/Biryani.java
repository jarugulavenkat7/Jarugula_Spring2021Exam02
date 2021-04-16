/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07;

/**
 *
 * @author Venkat Sai Jarugula
 */
public enum Biryani {
    VEGTABLE_BIRYANI(5.8,8.2,10.5,13.0),EGG_BIRYANI(6.5,9,11.5,14.7),
    CHICKEN_BIRYANI(10.0,13.0,16.5,20.7),MUTTON_BIRYANI(12.5,15.0,20.0,25.0);
    private  double singlePackPrice;
    private double largePackPrice;
    private double familyPackPrice;
    private double JumboPackPrice;

    private Biryani(double singlePackPrice, double largePackPrice, double familyPackPrice, double JumboPackPrice) {
        this.singlePackPrice = singlePackPrice;
        this.largePackPrice = largePackPrice;
        this.familyPackPrice = familyPackPrice;
        this.JumboPackPrice = JumboPackPrice;
    }

    public double getSinglePackPrice() {
        return singlePackPrice;
    }

    public double getLargePackPrice() {
        return largePackPrice;
    }

    public double getFamilyPackPrice() {
        return familyPackPrice;
    }

    public double getJumboPackPrice() {
        return JumboPackPrice;
    }
        
}
