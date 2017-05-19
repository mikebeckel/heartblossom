package com.beckel.builder.models;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Beckel on 5/17/2017.
 */
public class DevicesTest {

    @Test
    public void deviceUnitTest() {
        Devices device = new Devices();
        Assert.assertNull(device.getId());
        Assert.assertNull(device.getName());
        Assert.assertNull(device.getMacAddress());
        Assert.assertNull(device.getOperatingSystem());
        Assert.assertNull(device.getMemory());
    }

    @Test
    public void getId() throws Exception {
    }

    @Test
    public void getName() throws Exception {
    }

    @Test
    public void setName() throws Exception {
    }

    @Test
    public void getMacAddress() throws Exception {
    }

    @Test
    public void setMacAddress() throws Exception {
    }

    @Test
    public void getOperatingSystem() throws Exception {
    }

    @Test
    public void setOperatingSystem() throws Exception {
    }

    @Test
    public void getMemory() throws Exception {
    }

    @Test
    public void setMemory() throws Exception {
    }

}