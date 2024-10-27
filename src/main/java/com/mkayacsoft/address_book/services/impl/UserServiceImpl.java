package com.mkayacsoft.address_book.services.impl;

import com.mkayacsoft.address_book.dto.DTOAddress;
import com.mkayacsoft.address_book.dto.DTOUser;
import com.mkayacsoft.address_book.dto.DTOUserIU;
import com.mkayacsoft.address_book.exception.BaseException;
import com.mkayacsoft.address_book.exception.ErrorMessage;
import com.mkayacsoft.address_book.exception.MessageType;
import com.mkayacsoft.address_book.mapper.AddressMapper;
import com.mkayacsoft.address_book.mapper.UserMapper;
import com.mkayacsoft.address_book.model.Address;
import com.mkayacsoft.address_book.model.User;
import com.mkayacsoft.address_book.repository.UserRepository;
import com.mkayacsoft.address_book.services.IUserService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserRepository repository;
    @Autowired
    private UserMapper mapper;

    @Override
    public DTOUser getUserById(int id) {
        Optional<User> optionalUser = repository.findById(id);
        if (optionalUser.isEmpty()){
            throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST,null));
        }
        return mapper.toDto(optionalUser.get());

    }

    @Override
    public DTOUser saveUser(DTOUserIU dtoUserIU) {
        User user = mapper.toEntity(dtoUserIU);
       User dbUser =repository.save(user);
        return mapper.toDto(dbUser);
    }

    @Override
    public List<DTOUser> getAllUser(DTOUser dtoUser) {
        List<User> users = repository.findAll();
        return mapper.toListDTO(users);

    }


}
