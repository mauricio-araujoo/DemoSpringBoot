package com.maubas.crud;

import com.maubas.crud.dao.StudentDAO;
import com.maubas.crud.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	@Bean // Executado quando todas as beans estiverem prontas
	public CommandLineRunner commandLineRunner(StudentDAO db){
		return runner -> {
			System.out.println("Hello World");
			criarEstudante(db);
			//findStudent(db);
			//queryForStudents(db);
			queryForStudentsByLastName(db);
			updateStudent(db);
			deleteStudent(db);
		};
	}

	public void criarEstudante(StudentDAO database){
		Student theStudent = new Student("Mauricio","Ferreira","mauricio@mauricio");
		database.save(theStudent);
	}

	public void findStudent(StudentDAO database){
		Student myStudent = database.findById(3);
		System.out.println("O estudante encontrado foi o " + myStudent.getFirstName() + ", com o id: "+ myStudent.getId());
	}

	private void queryForStudents(StudentDAO studentDAO) {

		List<Student> theStudents = studentDAO.findAll();

		for (Student temp : theStudents) {
			System.out.println("estudante encontrado: "+temp.getFirstName());
		}
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {

		List<Student> theStudents = studentDAO.findByLastName("Fortunato");

		for (Student temp : theStudents) {
			System.out.println("estudante encontrado com sobrenome: "+temp.getFirstName()+" "+temp.getLastName());
		}
	}

	private void updateStudent(StudentDAO studentDAO){
		Student estudante = studentDAO.findById(1);
		estudante.setFirstName("Julia");
		studentDAO.update(estudante);
	}

	private void deleteStudent(StudentDAO studentDAO){
		studentDAO.delete(2);
	}
}
