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
public class Faculty extends Employee {

    private double officeHours;
    private int numberOfTeachingSubjects;

    public Faculty(String name, String address, String phoneNumber, String email, String Office, double salary, String dateHired, double officeHours, int numberOfTeachingSubjects) {
        super(name, address, phoneNumber, email, Office, salary, dateHired);
        this.officeHours = officeHours;
        this.numberOfTeachingSubjects = numberOfTeachingSubjects;
    }

    public double getOfficeHours() {
        return officeHours;
    }

    public int getNumberOfTeachingSubjects() {
        return numberOfTeachingSubjects;
    }

    @Override
    public String toString() {
        return "Class Name: Faculty" + "      Person Name :" + super.getName()
                + "\n************************************************";
    }

}
