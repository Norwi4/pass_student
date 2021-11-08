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
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Abaev Evgeny
 */
@Repository
public interface StudentsGroupRepository {

    /**
     *  Получение всех студентов конкретной группы
     * @param group_id номер группы
     * @return студентов группы
     */
    public List<Student> listStudentByGroup(Long group_id);
}
