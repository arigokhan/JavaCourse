package md.tekwill.lesson16.test;

import md.tekwill.lesson16.domain.Department;
import md.tekwill.lesson16.domain.Employee;
import md.tekwill.lesson16.service.impl.EmployeeServiceImpl;

import javax.swing.*;

public class TestEmployee {
    public static void main(String[] args) {
//        EmployeeServiceImpl employeeService= new EmployeeServiceImpl();
//        Department itDepartment = new Department("IT");
//        Employee employee1= new Employee("Ion","Paunescu",itDepartment);
//
//
//        Employee savedEmployee = employeeService.create(employee1);
//        //employeeService.update(employee1.getId(),employeeToUpdate);
//        System.out.println(employeeService.read(savedEmployee.getId()));
//
//
//        //UPDATE
//        Employee updatedEmployee= new Employee("Vasile","Paunescu",itDepartment);
//        boolean hasBennUpdated = employeeService.update(savedEmployee.getId(),updatedEmployee);
//        System.out.println(employeeService.read(savedEmployee.getId()) + "has been updated: " + hasBennUpdated);
//
//
//        //DELETE
//        employeeService.delete(savedEmployee.getId());

        JFrame frame = new JFrame("Employee");
        frame.setContentPane(new Employee().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }
}

