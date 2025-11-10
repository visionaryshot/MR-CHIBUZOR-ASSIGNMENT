package data.models;

import java.time.LocalDateTime;

public class Ticket {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
    }

    public Offense getOffense() {
        return Offense;
    }

    public void setOffense(Offense offense) {
        Offense = offense;
    }

    public boolean isHasPaid() {
        return hasPaid;
    }

    public void setHasPaid(boolean hasPaid) {
        this.hasPaid = hasPaid;
    }

    public LocalDateTime getDateOfBooking() {
        return dateOfBooking;
    }

    public void setDateOfBooking(LocalDateTime dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public LocalDateTime getDateOPayment() {
        return dateOPayment;
    }

    public void setDateOPayment(LocalDateTime dateOPayment) {
        this.dateOPayment = dateOPayment;
    }

    private Vehicle vehicle;
    private Offense Offense;
    private boolean hasPaid;
    private LocalDateTime dateOfBooking;
    private LocalDateTime dateOPayment;
}