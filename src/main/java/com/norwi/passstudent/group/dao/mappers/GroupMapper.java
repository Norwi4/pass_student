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

package com.norwi.passstudent.group.dao.mappers;

import com.norwi.passstudent.group.model.Group;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Abaev Evgeny
 */
@Component
public class GroupMapper implements RowMapper<Group> {

    public Group mapRow(ResultSet resultSet, int rowNum) throws SQLException{
        Group group = new Group();
        group.setId(resultSet.getLong("id"));
        group.setTitle(resultSet.getString("title"));
        return group;
    }
}
