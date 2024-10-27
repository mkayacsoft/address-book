package com.mkayacsoft.address_book.exception;

import lombok.Data;
import lombok.Getter;

@Getter
public enum MessageType {
    NO_RECORD_EXIST("1001","Kayıt bulunamadı"),
    GENERAL_EXCEPTION("9999","gENEL BİR HATA OLUŞTU");

    private String code;
    private String message;

    MessageType(String code,String message){
        this.code=code;
        this.message = message;
    }


}
