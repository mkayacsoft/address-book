package com.mkayacsoft.address_book.mapper;

import com.mkayacsoft.address_book.dto.DTOUser;
import com.mkayacsoft.address_book.dto.DTOUserIU;
import com.mkayacsoft.address_book.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(source = "address",target = "addresses")
    DTOUser toDto(User entity);
    User toEntity(DTOUserIU dtoUserIU);
    List<DTOUser> toListDTO(List<User> users);




}
