package com.mkayacsoft.address_book.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DTOAddressIU {
    private String addressDescription;
    private Integer userId;

}
