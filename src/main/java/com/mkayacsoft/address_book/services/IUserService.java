package com.mkayacsoft.address_book.services;

import com.mkayacsoft.address_book.dto.DTOUser;
import com.mkayacsoft.address_book.dto.DTOUserIU;
import com.mkayacsoft.address_book.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface IUserService {
    public DTOUser getUserById(int id);
    public DTOUser saveUser(DTOUserIU dtoUserIU);
    public List<DTOUser> getAllUser(DTOUser dtoUser);
}
