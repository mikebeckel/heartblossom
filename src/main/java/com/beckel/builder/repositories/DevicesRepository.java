package com.beckel.builder.repositories;

import com.beckel.builder.models.Devices;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Beckel on 5/17/2017.
 */
public interface DevicesRepository extends JpaRepository<Devices, Long> {
    Devices getByName(String name);
}
