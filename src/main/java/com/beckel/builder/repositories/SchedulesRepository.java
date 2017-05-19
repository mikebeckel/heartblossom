package com.beckel.builder.repositories;

import com.beckel.builder.models.Schedules;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Beckel on 5/17/2017.
 */
public interface SchedulesRepository extends JpaRepository<Schedules, Long> {
    Schedules getByEvent(String event);
}
