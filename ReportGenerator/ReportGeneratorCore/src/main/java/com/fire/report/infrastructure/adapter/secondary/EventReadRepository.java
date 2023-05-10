package com.fire.report.infrastructure.adapter.secondary;

import com.fire.report.infrastructure.adapter.secondary.entity.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EventReadRepository extends JpaRepository<EventEntity, Long> {
    Optional<EventEntity> findById(Long id);

    @Query("SELECT e FROM EventEntity e JOIN e.borderCross b WHERE b.vehicleReg = :vehicleReg")
    List<EventEntity> findAllByVehicleReg(@Param("vehicleReg") String vehicleReg);
}