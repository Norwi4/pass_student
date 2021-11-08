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

package com.norwi.passstudent.exception;

/**
 * @author Abaev Evgeny
 */
import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@ResponseStatus(code = NOT_FOUND)
public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(Long id) {
        super(String.format("Не найден объект по идентификатору: %d", id));
    }

    public EntityNotFoundException(String message) {
        super(message);
    }
}