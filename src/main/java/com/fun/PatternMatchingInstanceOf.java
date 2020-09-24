package com.fun;

/**
 * This is using a PREVIEW feature.
 */
public class PatternMatchingInstanceOf {

    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();

        applyAppropriateDiscount(customer);
        applyAppropriateDiscount(employee);
    }

    private static void applyAppropriateDiscount(Person person) {
        if (person instanceof Customer customer) {
            customer.customerDiscount();
        }
        else if (person instanceof Employee employee) {
            employee.employeeDiscount();
        }
    }



    //Classes

    abstract static class Person {}

    final static class Employee extends Person {
        void employeeDiscount() {
            System.out.println("Employee discount applied!!!");
        }
    }

    final static class Customer extends Person {
        void customerDiscount() {
            System.out.println("Customer discount applied!!!");
        }
    }
}
