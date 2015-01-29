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
    
    public void hireEmployee(){
        employee.setFirstName("Peter");
        employee.setLastName("Piper");
        employee.setSSN("012345678");     
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
