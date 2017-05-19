package com.beckel.builder.controllers;

import com.beckel.builder.models.Schedules;
import com.beckel.builder.repositories.SchedulesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Beckel on 5/18/2017.
 */
@RestController
public class SchedulesControllerV1 {
    @Autowired
    SchedulesRepository schedulesRepo;

    @RequestMapping(value = "/v1/schedules/getschedules", method = {RequestMethod.GET}, produces = "application/json" )
    public List<Schedules> getDevices(HttpServletResponse response) {
        List<Schedules> ret = new ArrayList<>();
        schedulesRepo.findAll().forEach(ret::add);
        return ret;
    }
}
