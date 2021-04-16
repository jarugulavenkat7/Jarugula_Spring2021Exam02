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
    private static final String status="GRADUATE";

    public Student(String name, String address, String phoneNumber, String email, String grade) {
        super(name, address, phoneNumber, email);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" + "grade=" + grade + '}';
    }
    
}
