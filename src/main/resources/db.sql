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

DROP TABLE IF EXISTS `students`;
DROP TABLE IF EXISTS `groups`;

CREATE TABLE `groups`
(
    `id` int NOT NULL AUTO_INCREMENT,
    `title` varchar(20) NOT NULL,
    PRIMARY KEY (ID)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8;

CREATE TABLE `students`
(
    `id`   INT         NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(20) NOT NULL,
    `age`  INT         NOT NULL,
    `group_id` int NOT NULL,
    PRIMARY KEY (ID),
    KEY `fk_group` (`group_id`),
    CONSTRAINT `fk_group` FOREIGN KEY (`group_id`) REFERENCES `groups` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8;

