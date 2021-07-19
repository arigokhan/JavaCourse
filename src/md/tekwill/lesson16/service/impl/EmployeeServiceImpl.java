package md.tekwill.lesson16.service.impl;

import md.tekwill.lesson16.dao.impl.DepartmentDaoImpl;
import md.tekwill.lesson16.dao.impl.EmployeeDaoImpl;
import md.tekwill.lesson16.domain.Employee;
import md.tekwill.lesson16.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDaoImpl employeeDao= new EmployeeDaoImpl();
    private DepartmentDaoImpl departmentDao= new DepartmentDaoImpl();
    @Override
    public Employee create(Employee employee) {
        if(departmentDao.read(employee.getDepartment().getName()) == null){
            System.out.println("Departamentul nu este gasit!!!");
            return null;
        }
        return employeeDao.create(employee);
    }

    @Override
    public Employee read(long employeeId) {
        return employeeDao.read(employeeId);
    }

    @Override
    public boolean update(long employeeId, Employee updatedEmployee) {
        return employeeDao.update(employeeId,updatedEmployee);

    }

    @Override
    public void delete(long employeeId) {
        employeeDao.delete(employeeId);
    }
}