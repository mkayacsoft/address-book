package com.mkayacsoft.address_book.services;

import com.mkayacsoft.address_book.dto.DTOUser;
import com.mkayacsoft.address_book.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface IUserService {
    public DTOUser getUserById(int id);
}
