package md.tekwill.lesson16.dao;
import md.tekwill.lesson16.domain.Department;

public interface DepartmentDao {
    Department read(String name);
}
