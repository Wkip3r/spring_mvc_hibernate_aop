package com.ivanryabov.spring.mvc_hibernate_aop.dao;

import com.ivanryabov.spring.mvc_hibernate_aop.entity.Grade;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GradeDAOImpl implements GradeDAO {

    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Grade> getAllGrades() {
        Session session = sessionFactory.getCurrentSession();

        List<Grade> grades = session.createQuery("FROM Grade",Grade.class).getResultList();

        return grades;
    }

    @Override
    public void addGrade(Grade grade) {

    }

    @Override
    public void updateGrade(Grade grade) {

    }

    @Override
    public void deleteGrade(int id) {

    }
}
