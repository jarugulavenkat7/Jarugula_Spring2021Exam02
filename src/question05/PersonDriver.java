/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question05;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class PersonDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student student = new Student("Suresh", "603 West,7th Street, Apt#9,"
                + " Maryville, Missouri 64468", "6605281431", "ganeshrvp@gmail.com","A");
       
        Faculty faculty = new Faculty("Naresh", "803 South,7th Street, Apt#9,"
                + " Maryville, Missouri 64468", "6605281431", "ganeshrvp@gmail.com",
                "St Joseph",85000.0,"01/01/2021",8.5,3);
        Staff staff = new Staff("Mahesh", "903 East,7th Street, Apt#9,"
                + " Maryville, Missouri 64468", "6605281431", "ganeshrvp@gmail.com",
                "Kansas",100000,"30/07/2018","Administrator");
        System.out.println(student);
        System.out.println(faculty);
        System.out.println(staff);
        
    }
    
}
