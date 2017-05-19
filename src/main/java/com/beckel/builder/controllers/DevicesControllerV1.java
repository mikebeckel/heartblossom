package com.beckel.builder.controllers;

import com.beckel.builder.models.Devices;
import com.beckel.builder.repositories.DevicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Beckel on 5/17/2017.
 */

@RestController
public class DevicesControllerV1 {
    @Autowired
    private DevicesRepository deviceRepo;

    /*
        Get Methods
            Get Devices
            Get Device By ID
            Get Device By Name
            Get Device With Name Like
    */
    @RequestMapping(value = "/v1/devices/getdevices", method = {RequestMethod.GET}, produces = "application/json" )
    public List<Devices> getDevices(HttpServletResponse response) {
        List<Devices> ret = new ArrayList<>();
        deviceRepo.findAll().forEach(ret::add);
        return ret;
    }

    @RequestMapping(value = "/v1/devices/getdevicebyid/{id}", method = {RequestMethod.GET})
    public Devices getDevices(HttpServletResponse response, @PathVariable Long id) {
        Devices ret;
        ret = deviceRepo.findOne(id);
        if(ret==null) {
            response.setStatus(404);
        }
        return ret;
    }

    @RequestMapping(value = "/v1/devices/getdevicebyname/{name}", method = {RequestMethod.GET})
    public Devices getDevices(HttpServletResponse response, @PathVariable String name) {
        Devices ret;
        ret = deviceRepo.getByName(name);
        if(ret==null) {
            response.setStatus(404);
        }
        return ret;
    }

    @RequestMapping(value = "v1/devices/adddevice", method = {RequestMethod.PUT})
    public String addDevice(HttpServletResponse response, @RequestBody Devices device) {
        try {
            String ret;
            device.setName(device.getName().toUpperCase());
            deviceRepo.save(device);
            response.setStatus(200);
            ret = "Successfully added " + device.getName() + " with ID of " + device.getId();
            return ret;
        }
        catch(Exception ex) {
            response.setStatus(501);
            return ex.getMessage();
        }
    }

    @RequestMapping(value = "v1/devices/deletedevice", method = {RequestMethod.DELETE})
    public String deleteDevice(HttpServletResponse response, @RequestBody Devices device) {

        return "BooYea";
    }
}
