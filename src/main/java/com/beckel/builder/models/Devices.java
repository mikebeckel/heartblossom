package com.beckel.builder.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Beckel on 5/17/2017.
 */
@Entity
public class Devices {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name="id")
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String macAddress;

    @NotNull
    private String operatingSystem;

    @NotNull
    private Integer memory;
}
