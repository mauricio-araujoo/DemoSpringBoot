package restApi.crudDemo.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import restApi.crudDemo.DAO.EmployeeDAO;
import restApi.crudDemo.Entity.Employee;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeDAO employeeDAO;

    // quick and dirty: inject employee dao (use constructor injection)
    public EmployeeRestController(EmployeeDAO theEmployeeDAO) {
        employeeDAO = theEmployeeDAO;
    }

    // expose "/employees" and return a list of employees
    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

}