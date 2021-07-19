package md.tekwill.lesson16.service;

import md.tekwill.lesson16.domain.Employee;

public interface EmployeeService {
    Employee create(Employee employee);

    Employee read(long employeeId);

    boolean update(long employeeId, Employee updatedEmployee);

    void delete(long employeeId);
}
