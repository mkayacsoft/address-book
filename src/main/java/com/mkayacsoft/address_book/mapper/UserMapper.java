package com.mkayacsoft.address_book.mapper;

import com.mkayacsoft.address_book.dto.DTOUser;
import com.mkayacsoft.address_book.model.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    DTOUser toDto(User entity);
    User toEntity(DTOUser dtoUser);
    List<DTOUser> toListDTO(List<User> users);

}
