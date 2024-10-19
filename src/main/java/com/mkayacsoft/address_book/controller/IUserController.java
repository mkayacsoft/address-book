package com.mkayacsoft.address_book.controller;

import com.mkayacsoft.address_book.dto.DTOUser;

import java.util.List;

public interface IUserController{
    public DTOUser saveUser(DTOUser dtoUser);
    public List<DTOUser> getAllUser(DTOUser dtoUser);
}
