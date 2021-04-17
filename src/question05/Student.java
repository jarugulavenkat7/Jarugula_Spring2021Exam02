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
public class Student extends Person {

    private String grade;
    private static final String STATUS = "GRADUATE";

    public Student(String name, String address, String phoneNumber, String email, String grade) {
        super(name, address, phoneNumber, email);
        this.grade = grade;
    }
    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Class Name: Student" + "      Person Name :"+super.getName()
                +"\n************************************************";
    }

}
