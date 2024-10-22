package com.mkayacsoft.address_book.mapper;

import com.mkayacsoft.address_book.dto.DTOAddress;
import com.mkayacsoft.address_book.dto.DTOAddressIU;
import com.mkayacsoft.address_book.model.Address;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    DTOAddress toDto(Address entity);
    Address toEntity(DTOAddressIU dtoAddressIU);
    List<DTOAddress> toDtoList(List<Address> addresses);



}
