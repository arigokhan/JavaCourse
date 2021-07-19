package md.tekwill.lesson16.dao.impl;

import md.tekwill.lesson16.dao.EmployeeDao;
import md.tekwill.lesson16.domain.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
    private static Employee[] employees = new Employee[30];

    @Override
    public Employee create(Employee employee) {
        employees[0] = employee;
        return employees[0];
    }

    @Override
    public Employee read(long employeeId) {

        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if(employee.getId()==employeeId){
                return employee;
            }
        }
        return null;
    }

    @Override
    public boolean update(long employeeId, Employee updatedEmployee) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee.getId() == employeeId) {
                employees[i].setFirstName(updatedEmployee.getFirstName());
                employees[i].setLastName(updatedEmployee.getLastName());
                employees[i].setDepartment(updatedEmployee.getDepartment());
                return true;
            }
        }
        return false;
    }

    @Override
    public void delete(long employeeId) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee.getId() == employeeId) {
                employees[i] = null;
                System.out.println("Employee has been deleted! "+employee);
                break;
            }
        }
    }
}
