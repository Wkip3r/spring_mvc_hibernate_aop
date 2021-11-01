package com.ivanryabov.spring.mvc_hibernate_aop.service;

import com.ivanryabov.spring.mvc_hibernate_aop.entity.Grade;

import java.util.List;

public interface GradeService {
    public List<Grade> getAllGrades();

    public void addGrade(Grade grade);

    public void updateGrade(Grade grade);

    public void deleteGrade(int id);
}
