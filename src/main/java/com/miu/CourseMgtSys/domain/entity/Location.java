package com.miu.CourseMgtSys.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Location {
    @Id
    @GeneratedValue
    private long Id;
    @ManyToOne
    @JoinColumn(name = "location_address")
    private Address address;
}
