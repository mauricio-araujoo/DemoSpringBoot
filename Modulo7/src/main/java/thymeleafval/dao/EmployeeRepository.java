package thymeleafval.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import thymeleafval.entity.Employee;


import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!

    // add a method to sort by last name
    public List<Employee> findAllByOrderByLastNameAsc();

}