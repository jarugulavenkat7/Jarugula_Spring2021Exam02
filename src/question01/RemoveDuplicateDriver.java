/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class RemoveDuplicateDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter ten integers: ");
        for (int i=0; i<10; i++) {
                list.add(scanner.nextInt()); 
         }
        removeDuplicate(list);
    }
     public static void removeDuplicate(ArrayList<Integer> list){
            ArrayList<Integer> listWithoutDuplicates = new ArrayList<>();
             System.out.print("The distinct integers are ");
            for (Integer listElement : list) {
  
            // If this element is not present in newList
            // then add it
            if (!listWithoutDuplicates.contains(listElement)) {
  
                listWithoutDuplicates.add(listElement);
                System.out.print(listElement+" ");
            }
        }
            System.out.println(" ");
        }
    
}
