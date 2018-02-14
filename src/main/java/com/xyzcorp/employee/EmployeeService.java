package com.xyzcorp.employee;

import java.sql.SQLException;

public class EmployeeService {
    private EmployeeDAO employeeDAO;

    public EmployeeService(EmployeeDAO employeeDAO) {

        this.employeeDAO = employeeDAO;
    }

    public void hireEmployee(Employee employee) throws SQLException {
        if (employee == null)
            throw new NullPointerException("Employee was null.");
        if(employee.getFirstName().isEmpty())
            throw new IllegalArgumentException("First name cannot be blank.");
        if(employee.getLastName().isEmpty())
            throw new IllegalArgumentException("Last name cannot be blank.");

        this.employeeDAO.persist(employee);
    }
}
