package com.miu.CourseMgtSys.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {
    @Id
    @GeneratedValue
    private long Id;
    private String name;
    private String phone;
    private String email;

    // make ManyToOne relations lazy, use join fetch to load the related object
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_address")
    private Address address;

}
