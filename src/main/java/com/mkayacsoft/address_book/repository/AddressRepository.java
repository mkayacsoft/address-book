package com.mkayacsoft.address_book.repository;

import com.mkayacsoft.address_book.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer> {
}
