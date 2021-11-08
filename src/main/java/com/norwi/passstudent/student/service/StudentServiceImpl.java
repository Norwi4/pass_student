/*
 * Copyright (c) 2021 FORS Development Center
 * Trifonovskiy tup. 3, Moscow, 129272, Russian Federation
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * FORS Development Center ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with FORS.
 */

package com.norwi.passstudent.student.service;

import com.norwi.passstudent.exception.EntityNotFoundException;
import com.norwi.passstudent.student.dao.StudentRepository;
import com.norwi.passstudent.student.model.Student;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author Abaev Evgeny
 */
@Component
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    @Transactional
    public Optional<Student> getStudent(Long id) {
        return studentRepository.getStudent(id);
    }

    @Override
    @Transactional
    public List<Student> listStudents() {
        return studentRepository.listStudents();
    }
}
