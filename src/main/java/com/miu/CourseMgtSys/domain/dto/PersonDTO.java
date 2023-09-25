package com.miu.CourseMgtSys.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonDTO {
    private long Id;
    private String name;
    private String phone;
    private String email;
    private Long addressId;
}
