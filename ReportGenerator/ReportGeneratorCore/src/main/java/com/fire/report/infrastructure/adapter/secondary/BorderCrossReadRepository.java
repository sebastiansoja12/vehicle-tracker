package com.fire.report.infrastructure.adapter.secondary;

import com.fire.report.infrastructure.adapter.secondary.entity.BorderCrossEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface BorderCrossReadRepository extends JpaRepository<BorderCrossEntity, String> {
    Optional<BorderCrossEntity> findByVehicleReg(String vehicleReg);

    List<BorderCrossEntity> findAllByVehicleReg(String vehicleReg);
}
