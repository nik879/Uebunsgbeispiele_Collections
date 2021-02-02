package org.campus02.at.emp;

import java.util.ArrayList;

public class EmployeeManager {
    private ArrayList<Employee> Employees = new ArrayList<>();

    void addEmployee(Employee employee) {
        Employees.add(employee);
    }

    Employee findByEmpNumber(int Number) {
        for (Employee employee : Employees) {
            if (employee.getEmpNumber() == Number) {
                return employee;
            }
        }
        return null;
    }

    ArrayList<Employee> findByDepartment(String Department) {
        ArrayList<Employee> employees = new ArrayList<>();
        for (Employee employee : Employees) {
            if (employee.getDepartment().contains(Department)) {
                employees.add(employee);
            }
        }
        return employees;
    }


}
