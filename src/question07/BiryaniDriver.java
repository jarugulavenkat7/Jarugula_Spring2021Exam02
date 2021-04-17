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
public class BiryaniDriver {

    public static void main(String[] args) {
        System.out.println("Question:7 By Venkat Sai Jarugula");
        System.out.println("-----------------------------------------------------------");
        System.out.println(String.format("%-18s %-10s %-10s %-10s %-10s", "Types of Biryani", "Single", "Large", "Family", "Jumbo"));
        System.out.println("-----------------------------------------------------------");
        for (Biryani biryani : Biryani.values()) {

            System.out.println(String.format("%-18s %-10s %-10s %-10s %-10s", biryani, "$" + biryani.getSinglePackPrice(),
                    "$" + biryani.getLargePackPrice(), "$" + biryani.getFamilyPackPrice(), "$" + biryani.getJumboPackPrice()));

        }
        System.out.println("-----------------------------------------------------------");
    }

}
