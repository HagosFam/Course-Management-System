package com.miu.CourseMgtSys.repository;

import com.miu.CourseMgtSys.domain.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
