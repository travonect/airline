package com.travonect.api.controller;

import com.travonect.api.model.user.User;
import com.travonect.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public User create(@RequestBody User user) {
        return userService.createUser(user);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getUserByEmail", consumes = MediaType.TEXT_PLAIN_VALUE)
    public User read(@RequestBody String email) {
        return userService.getUserByEmail(email);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public User update(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @RequestMapping(value = "/deleteUserbyEmail", method = RequestMethod.DELETE, consumes = MediaType.TEXT_PLAIN_VALUE)
    public void delete(@RequestBody String email) {
        userService.deleteUserByEmail(email);
    }

}
