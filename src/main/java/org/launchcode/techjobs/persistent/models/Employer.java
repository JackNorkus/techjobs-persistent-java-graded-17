package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
    public Employer() {
    }

    @Size
    @NotNull
    private String location;
    private List<Job> jobs = new ArrayList<>();

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
