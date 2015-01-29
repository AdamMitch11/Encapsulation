/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Adam
 */
public class HumanResourcesManager {
    private String name;
    
    private Employee employee = new Employee();
    
    public void hireEmployee(String firstName,String lastName,String ssn){
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setSSN(ssn);     
    }
    
    public void giveOrientation() {
        employee.employeeOrientation();
    }
    
    public void getEmployeeStatus() {
        System.out.println("The employee's status is: " + employee.getStatus());
    }
    
    public void moveEmployeeIntoCubicle() {
        employee.moveIntoCubicle("C123");
    }
}
