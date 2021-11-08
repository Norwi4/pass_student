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

package com.norwi.passstudent.group.model;

import com.norwi.passstudent.student.model.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Abaev Evgeny
 */
public class Group {
    private Long id;
    private String title;
    private List<Student> studentsGroup =new ArrayList<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Student> getStudentsGroup() {
        return studentsGroup;
    }

    public void setStudentsGroup(List<Student> studentsGroup) {
        this.studentsGroup = studentsGroup;
    }
}
