package com.mkayacsoft.address_book.controller.impl;


import com.mkayacsoft.address_book.controller.IAddressController;
import com.mkayacsoft.address_book.dto.DTOAddress;
import com.mkayacsoft.address_book.dto.DTOAddressIU;
import com.mkayacsoft.address_book.services.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressControllerImpl implements IAddressController {

    @Autowired
    private IAddressService addressService;


    @PostMapping("/save")
    @Override
    public DTOAddress saveAddress(@RequestBody DTOAddressIU dtoAddressIU) {
        return addressService.saveAddress(dtoAddressIU);
    }

    @GetMapping("/all")
    @Override
    public List<DTOAddress> getAllAddress(DTOAddress dtoAddress) {
        return addressService.getAllAddress(dtoAddress);
    }


}
