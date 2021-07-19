package md.tekwill.lesson16.dao;

import md.tekwill.lesson16.domain.Employee;

//CRUD
public interface EmployeeDao {
    Employee create(Employee employee);

    Employee read(long employeeId);

    boolean update(long employeeId, Employee updatedEmployee);

    void delete(long employeeId);
}
