package com.joantolos.business.api.ct.entity;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlRootElement(name = "PingPongInput")
@XmlType(propOrder={"id","motion"})
public class PingPongInput implements Serializable {
    int id;
    String motion;

    public PingPongInput() {

    }

    @XmlElement()
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement()
    public String getMotion() {
        return motion;
    }

    public void setMotion(String motion) {
        this.motion = motion;
    }
}
