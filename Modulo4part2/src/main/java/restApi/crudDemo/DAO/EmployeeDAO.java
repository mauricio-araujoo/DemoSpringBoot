package restApi.crudDemo.DAO;

import restApi.crudDemo.Entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

}