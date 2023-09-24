package com.miu.CourseMgtSys.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.cdi.Eager;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Person {
    @Id
    @GeneratedValue
    private long Id;
    private String name;
    private String phone;
    private String email;

    @ManyToOne
    @JoinColumn(name = "person_address")
    private Address address;

}
