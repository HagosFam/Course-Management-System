package com.miu.CourseMgtSys.repository;

import com.miu.CourseMgtSys.domain.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {

    // finding my two attributes
    Address findByZipAndStreet(String zip, String street);
}
