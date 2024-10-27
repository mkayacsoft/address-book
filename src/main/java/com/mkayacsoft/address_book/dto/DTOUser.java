package com.mkayacsoft.address_book.dto;

import com.mkayacsoft.address_book.model.Address;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DTOUser {
    private Integer id;
    private String name;
    private String lastName;
    private List<DTOAddress> addresses;

}
