package com.xyzcorp.employee;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeServiceTest {
    @Test
    public void testComponentManualWiring() throws SQLException {
        try(Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "")){
            EmployeeDAO employeeDAO = new EmployeeDAO(connection);
            EmployeeService employeeService = new EmployeeService(employeeDAO);
            employeeService.hireEmployee(new Employee("Jorge", "Gomez"));
        }
    }
}
