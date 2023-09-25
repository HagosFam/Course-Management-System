package com.miu.CourseMgtSys.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstructorDTO extends PersonDTO {
    private long Id;
    private String instructorId;
    private List<Long> courseOfferingDayListIds;
}
