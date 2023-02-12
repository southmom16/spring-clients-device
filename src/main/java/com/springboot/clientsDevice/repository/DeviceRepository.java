package com.springboot.clientsDevice.repository;

import com.springboot.clientsDevice.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface DeviceRepository extends JpaRepository<Device, Long>{


    @Modifying
    @Transactional
    @Query("update Device set status = :status WHERE id = :id")
    Integer updateDeviceUsingQueryAnnotation(@Param("status") String status, @Param("id") long id);
}
