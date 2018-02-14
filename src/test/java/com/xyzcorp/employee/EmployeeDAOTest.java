package com.xyzcorp.employee;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeDAOTest {
    @Test
    public void testJDBCPersist() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");
        EmployeeDAO employeeDAO = new EmployeeDAO(connection);
        employeeDAO.persist(new Employee("Chris", "Mattera"));
        connection.close();
    }

    @Test
    public void testHibernetePersist() {
        // Testing shit
    }
}
