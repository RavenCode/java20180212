package com.xyzcorp.employee;

import java.util.Objects;

public class Employee {
    private final String firstName;
    private final String lastName;

    /**
     * Constructs employee object
     * @param firstName
     * @param lastName
     */
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Returns employee first name
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Returns employee last name
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Overrided equals method
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName);
    }

    /**
     * Overrided hashCode method
     * @return
     */
    @Override
    public int hashCode() {

        return Objects.hash(firstName, lastName);
    }

    /**
     * Overrided toString method
     * @return
     */
    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
