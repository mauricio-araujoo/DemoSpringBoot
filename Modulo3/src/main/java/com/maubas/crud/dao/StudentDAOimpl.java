package com.maubas.crud.dao;

import com.maubas.crud.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOimpl implements StudentDAO{

    public EntityManager db;

    @Autowired
    public void setEntMan(EntityManager theManager){
        db = theManager;
    }

    @Override
    @Transactional
    public void save(Student oEstudante) {
        db.persist(oEstudante);
    }

    @Override
    public Student findById(int id) {
        return db.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> query = db.createQuery("FROM Student",Student.class);
        List<Student> students = query.getResultList();
        return students;
    }

    @Override
    public List<Student> findByLastName(String LastName) {
        TypedQuery<Student> query = db.createQuery("FROM Student WHERE lastName=:param",Student.class);
        query.setParameter("param",LastName);
        List<Student> students = query.getResultList();
        return students;
    }

    @Override
    @Transactional
    public void update(Student theStudent) {
        db.merge(theStudent);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Student theStudent = db.find(Student.class, id);
        db.remove(theStudent);
    }
}
