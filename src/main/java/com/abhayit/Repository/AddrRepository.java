package com.abhayit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhayit.Entity.Address;

public interface AddrRepository extends JpaRepository<Address, Integer>{

}
