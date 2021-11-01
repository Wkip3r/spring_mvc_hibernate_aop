package com.ivanryabov.spring.mvc_hibernate_aop.service;

import com.ivanryabov.spring.mvc_hibernate_aop.dao.GradeDAO;
import com.ivanryabov.spring.mvc_hibernate_aop.entity.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GradeServiceImpl implements GradeService{

    @Autowired
    private GradeDAO gradeDAO;

    @Override
    @Transactional
    public List<Grade> getAllGrades() {
        return gradeDAO.getAllGrades();
    }

    @Override
    @Transactional
    public void addGrade(Grade grade) {

    }

    @Override
    @Transactional
    public void updateGrade(Grade grade) {

    }

    @Override
    @Transactional
    public void deleteGrade(int id) {

    }
}
