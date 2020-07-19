package com.edw.controller;

import com.edw.model.User;
import com.edw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <pre>
 *     com.edw.controller.UserController
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 18 Jul 2020 14:16
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Value("#{environment.id}")
    private String id;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> index() {
        return userService.getUsers();
    }

    @RequestMapping(value = "/id", method = RequestMethod.GET)
    public String getId() {
        return id;
    }

}
