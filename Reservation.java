
package com.mycompany.prblm_2;

// Reservation.java
import java.util.Date;

public class Reservation {
    private String reservationId;
    private Guest guest;
    private Room room;
    private Date checkInDate;
    private Date checkOutDate;

    public Reservation(String reservationId, Guest guest, Room room, Date checkInDate, Date checkOutDate) {
        this.reservationId = reservationId;
        this.guest = guest;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public String getReservationId() {
        return reservationId;
    }

    public Guest getGuest() {
        return guest;
    }

    public Room getRoom() {
        return room;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }
}
