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

import com.norwi.passstudent.group.model.Group;

import java.util.List;
import java.util.Optional;

/**
 * @author Abaev Evgeny
 */
public interface GroupRepository {
    /**
     * @param id группы
     * @return группу со студентами
     */
    public Optional<Group> getGroup(Long id);

    /**
     * @return все группы
     */
    // TODO: 08.11.2021 сделать показ групп по факультетам
    public List<Group> listGroup();

}
