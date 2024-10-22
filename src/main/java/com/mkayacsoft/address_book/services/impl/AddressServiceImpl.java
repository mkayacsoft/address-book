package com.mkayacsoft.address_book.services.impl;

import com.mkayacsoft.address_book.dto.DTOAddress;
import com.mkayacsoft.address_book.dto.DTOAddressIU;
import com.mkayacsoft.address_book.mapper.AddressMapper;
import com.mkayacsoft.address_book.model.Address;
import com.mkayacsoft.address_book.model.User;
import com.mkayacsoft.address_book.repository.AddressRepository;
import com.mkayacsoft.address_book.repository.UserRepository;
import com.mkayacsoft.address_book.services.IAddressService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements IAddressService {

    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private AddressMapper addressMapper;
    @Autowired
    private UserRepository repository;

    @Override
    public DTOAddress saveAddress(DTOAddressIU dtoAddressIU) {
        User user = repository.findById(dtoAddressIU.getUserId())
                .orElseThrow(() -> new EntityNotFoundException("User not found with id: " + dtoAddressIU.getUserId()));
        Address address = addressMapper.toEntity(dtoAddressIU);
        address.setUser(user);
        Address response = addressRepository.save(address);
        return addressMapper.toDto(response);
    }

    @Override
    public List<DTOAddress> getAllAddress(DTOAddress dtoAddress) {
        List<Address> address = addressRepository.findAll();
        return addressMapper.toDtoList(address);
    }


}
