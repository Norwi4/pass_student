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

package com.norwi.passstudent.student.dao;

import com.norwi.passstudent.student.model.Student;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @author Abaev Evgeny
 */
public interface StudentRepository {

    /**
     * This is the method to be used to initialize
     * database resources ie. connection.
     */
    Optional<Student> getStudent(Long id);
    /**
     * This is the method to be used to list down
     * all the records from the Student table.
     * @return
     */
    public List<Student> listStudents();
}
