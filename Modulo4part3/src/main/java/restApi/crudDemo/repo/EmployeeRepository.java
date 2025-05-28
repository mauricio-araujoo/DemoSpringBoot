package restApi.crudDemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import restApi.crudDemo.entity.Employee;

@RepositoryRestResource(path="users")//muda o nome para fazer a requisição
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
