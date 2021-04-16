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
public class Staff extends Employee{
    private String title;

    public Staff(  String name, String address, String phoneNumber, String email,String Office, double salary, String dateHired,String title) {
        super( name, address, phoneNumber, email,Office, salary, dateHired);
        this.title = title;
    }

     

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff{" + "title=" + title + '}';
    }
    
    
}
