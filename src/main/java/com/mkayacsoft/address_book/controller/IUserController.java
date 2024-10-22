package com.mkayacsoft.address_book.controller;

import com.mkayacsoft.address_book.dto.DTOUser;
import com.mkayacsoft.address_book.dto.DTOUserIU;

import java.util.List;

public interface IUserController{
    public DTOUser saveUser(DTOUserIU dtoUserIU);
    public List<DTOUser> getAllUser(DTOUser dtoUser);
    public DTOUser getUserById(int id);
}
