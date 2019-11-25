package org.launchcode.aleandelebake.controllers;

import org.launchcode.aleandelebake.models.data.UsersDao;
import org.springframework.beans.factory.annotation.Autowired;

public class UsersController {
    @Autowired
    private UsersDao usersDao;
}
