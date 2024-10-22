package com.mkayacsoft.address_book.controller;

import com.mkayacsoft.address_book.dto.DTOAddress;
import com.mkayacsoft.address_book.dto.DTOAddressIU;

import java.util.List;

public interface IAddressController {
    public DTOAddress saveAddress(DTOAddressIU dtoAddressIU);
    public List<DTOAddress>getAllAddress(DTOAddress dtoAddress);
}
