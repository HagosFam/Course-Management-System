package com.miu.CourseMgtSys.repository;

import com.miu.CourseMgtSys.domain.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {

    // Lists of persons with their address
    // the laoding should be fetchType.LAZY
    @Query("select c from Person c join fetch c.address")
    List<Person> findByName(String name);
}
