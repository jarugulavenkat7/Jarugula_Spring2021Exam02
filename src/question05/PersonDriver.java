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

    public static void main(String[] args) {
      System.out.println("Question:5 By Venkat Sai Jarugula");
      Person person=new Person("Nagesh", "103 NorthWest,7th Street, Apt#9,"
                + " Maryville, Missouri 64468", "6605281431", "ganeshrvp@gmail.com");
      Employee employee = new Employee("Rupesh", "203 South,7th Street, Apt#9,"
                + " Maryville, Missouri 64468", "6605281431", "ganeshrvp@gmail.com",
                "St Joseph",85000.0,"01/01/2021");
        Student student = new Student("Suresh", "603 West,7th Street, Apt#9,"
                + " Maryville, Missouri 64468", "6605281431", "ganeshrvp@gmail.com","A");
       
        Faculty faculty = new Faculty("Naresh", "803 South,7th Street, Apt#9,"
                + " Maryville, Missouri 64468", "6605281431", "ganeshrvp@gmail.com",
                "St Joseph",85000.0,"01/01/2021",8.5,3);
        Staff staff = new Staff("Mahesh", "903 East,7th Street, Apt#9,"
                + " Maryville, Missouri 64468", "6605281431", "ganeshrvp@gmail.com",
                "Kansas",100000,"30/07/2018","Administrator");
        System.out.println(person.toString());
        System.out.println(employee.toString());
        System.out.println(student.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
        
    }
    
}
