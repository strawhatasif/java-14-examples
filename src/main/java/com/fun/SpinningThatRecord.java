package com.fun;

import com.fun.record.Customer;
import com.fun.record.Employee;

/**
 * This classes uses a PREVIEW feature (JEP-359) in Java 14 - record classes.
 */
public class SpinningThatRecord {

    public static void main(String[] args) {
       getEmployeeData();
       getCustomerData();
    }

    private static void getEmployeeData() {
        Employee employee = new Employee(11750, "Rebecca Paltrow");

        //NOTE: to access properties from record classes one does NOT include get for the getter.
        System.out.println("The employee's name is " + employee.name()
                + " and their employee ID is: " + employee.employeeID());


        Employee newEmployee = new Employee(22556, "Samuel Johnson");
        
        //Demonstrating toString (generated by the record class).
        System.out.println(newEmployee.toString());
    }

    private static void getCustomerData() {
        Customer customer = new Customer("f8f629a0-fe92-11ea-adc1-0242ac120002", "Laura Danbury");

        //This will leverage and overwritten toString method
        System.out.println(customer.toString());
    }
}
