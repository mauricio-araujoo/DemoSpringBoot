package com.maubas.crud.dao;

import com.maubas.crud.entity.Student;

import java.util.List;

public interface StudentDAO {
    public void save(Student oEstudante);

    public Student findById(int id);

    public List<Student> findAll();

    public List<Student> findByLastName(String LastName);

    public void update(Student theStudent);

    public void delete(int id);
}
