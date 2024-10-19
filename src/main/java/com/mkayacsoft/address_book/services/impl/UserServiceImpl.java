package com.mkayacsoft.address_book.services.impl;

import com.mkayacsoft.address_book.dto.DTOUser;
import com.mkayacsoft.address_book.mapper.UserMapper;
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
        // Kullanıcı varsa DTO'ya çevir, yoksa hata fırlat
        User user = optionalUser.orElseThrow(() -> new EntityNotFoundException("User not found with id: " + id));
        return mapper.toDto(user);
    }

    @Override
    public DTOUser saveUser(DTOUser dtoUser) {
        User user = mapper.toEntity(dtoUser);
       User dbUser =repository.save(user);
        return mapper.toDto(dbUser);
    }

    @Override
    public List<DTOUser> getAllUser(DTOUser dtoUser) {
        List<User> users = repository.findAll();
        return mapper.toListDTO(users);

    }


}
