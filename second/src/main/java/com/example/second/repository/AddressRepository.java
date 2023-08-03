package com.example.second.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.second.model.Address;

public interface AddressRepository extends JpaRepository<Address,Long> {
    
}
