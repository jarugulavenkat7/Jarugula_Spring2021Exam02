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
public class Employee extends Person {

    private String Office;
    private double salary;
    private String dateHired;

    public Employee(String name, String address, String phoneNumber,
            String email, String Office, double salary, String dateHired) {
        super(name, address, phoneNumber, email);
        this.Office = Office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return Office;
    }

    public double getSalary() {
        return salary;
    }

    public String getDateHired() {
        return dateHired;
    }

    @Override
    public String toString() {
        return "Class Name: Employee" + "     Person Name :" + super.getName()
                + "\n************************************************";
    }

}
