/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Object> arrayList=new ArrayList<>();
        
        arrayList.add(new Loan(1000, 5, 5));
        arrayList.add(new Date());
        arrayList.add(new String("once a bearcat always a bearcat") );
        arrayList.add(new Circle(4.0));
        for(Object arrObject:arrayList){
            
            System.out.println(arrObject);
            System.out.println("************************************************");
        }
        
    }
    
}
