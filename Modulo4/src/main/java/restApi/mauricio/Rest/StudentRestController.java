package restApi.mauricio.Rest;

import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import restApi.mauricio.Entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    @PostConstruct
    public void postStudents(){
        theStudents = new ArrayList<>();
        theStudents.add(new Student("Mauricio", "Ferreira"));
        theStudents.add(new Student("Julia", "Fortunato"));
        theStudents.add(new Student("Antonia", "Rodrigues"));
    }

    @GetMapping("/students")
    public List<Student> getStudents(){

        return theStudents;
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable int id){

        if (id > theStudents.size() || id < 0){
            throw new StudentNotFoundException("Student id não achou: " + id);
        }

        return theStudents.get(id);
    }

}
