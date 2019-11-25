package org.launchcode.aleandlebake.controllers;

import org.launchcode.aleandlebake.models.data.UsersDao;
import org.springframework.beans.factory.annotation.Autowired;

public class UsersController {
    @Autowired
    private UsersDao usersDao;
}
