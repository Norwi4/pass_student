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

import com.norwi.passstudent.student.dao.mappers.StudentMapper;
import com.norwi.passstudent.student.model.Student;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author Abaev Evgeny
 */
@Repository
public class StudentsGroupRepositoryImpl implements StudentsGroupRepository {

    private final JdbcTemplate jdbcTemplate;
    private final StudentMapper studentMapper;

    public StudentsGroupRepositoryImpl(JdbcTemplate jdbcTemplate, StudentMapper studentMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.studentMapper = studentMapper;
    }

    @Override
    public List<Student> listStudentByGroup(Long group_id) {
        return jdbcTemplate.query(
                "select * from pass_student.stident where group_id=?",
                studentMapper,
                group_id
        );
    }
}
