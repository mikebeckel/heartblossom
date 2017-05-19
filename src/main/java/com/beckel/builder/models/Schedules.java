package com.beckel.builder.models;

import com.beckel.builder.models.Devices;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Beckel on 5/18/2017.
 */
@Entity
public class Schedules {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name="id")
    private Long id;
    @NotNull
    private Devices device_id;
    @NotNull
    private Date startTime;
    @NotNull
    private String event;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Devices.class)
    @JoinColumn(name = "id")
    public Devices getDevice() {
        return device_id;
    }

    public void setDevice(Devices device_id) {
        this.device_id = device_id;
    }
}
