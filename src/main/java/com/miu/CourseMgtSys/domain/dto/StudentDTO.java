package com.miu.CourseMgtSys.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO extends PersonDTO {
    private long Id;
    private String studentId;
    private List<Long> courseOfferingsIds;
}
