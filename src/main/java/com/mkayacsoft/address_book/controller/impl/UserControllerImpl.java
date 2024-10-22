package com.mkayacsoft.address_book.controller.impl;

import com.mkayacsoft.address_book.controller.IUserController;
import com.mkayacsoft.address_book.dto.DTOUser;
import com.mkayacsoft.address_book.dto.DTOUserIU;
import com.mkayacsoft.address_book.model.User;
import com.mkayacsoft.address_book.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserControllerImpl implements IUserController {
    @Autowired
    private IUserService userService;


    @PostMapping("/save")
    @Override
    public DTOUser saveUser(@RequestBody DTOUserIU dtoUserIU) {
        return userService.saveUser(dtoUserIU);
    }

    @GetMapping("/all")
    @Override
    public List<DTOUser> getAllUser(DTOUser dtoUser) {
        return userService.getAllUser(dtoUser);
    }

    @GetMapping("/{id}")
    @Override
    public DTOUser getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }


}
