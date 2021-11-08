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

package com.norwi.passstudent.group.dao;

import com.norwi.passstudent.group.dao.mappers.GroupMapper;
import com.norwi.passstudent.group.model.Group;
import com.norwi.passstudent.student.dao.StudentsGroupRepositoryImpl;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author Abaev Evgeny
 */
@Repository
public class GroupRepositoryImpl implements GroupRepository{

    private final JdbcTemplate jdbcTemplate;
    private final GroupMapper groupMapper;
    private final StudentsGroupRepositoryImpl studentsGroupRepository;

    public GroupRepositoryImpl(JdbcTemplate jdbcTemplate, GroupMapper groupMapper, StudentsGroupRepositoryImpl studentsGroupRepository) {
        this.jdbcTemplate = jdbcTemplate;
        this.groupMapper = groupMapper;
        this.studentsGroupRepository = studentsGroupRepository;
    }


    @Override
    public Optional<Group> getGroup(Long id) {
        try {
            Optional<Group> group = Optional.ofNullable(
                    jdbcTemplate.queryForObject(
                            "select * from pass_student.group where id=?",
                            groupMapper,
                            id
                    )
            );
            group.ifPresent(e -> e.setStudentsGroup(studentsGroupRepository.listStudentByGroup(id)));
            return group;
        } catch (IncorrectResultSizeDataAccessException e) {
            return Optional.empty();
        }
    }

    @Override
    public List<Group> listGroup() {
        return null;
    }
}
