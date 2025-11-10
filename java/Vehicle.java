package data.models;

import java.time.Year;

public class Vehicle {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Owner getOwnner() {
        return ownner;
    }

    public void setOwnner(Owner ownner) {
        this.ownner = ownner;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private String name;
    private String model;
    private Year year;
    private String colour;
    private String plateNumber;
    private Owner ownner;
    private Ticket ticket;

    private int id;

    public int getId() {
        return id;
    }

}