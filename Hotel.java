
package com.mycompany.prblm_2;

// Hotel.java
import java.util.ArrayList;

public class Hotel {
    private String hotelName;
    private ArrayList<Room> rooms;
    private ArrayList<Reservation> reservations;

    public Hotel(String hotelName) {
        this.hotelName = hotelName;
        this.rooms = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public Room findAvailableRoom(String type) {
        for (Room room : rooms) {
            if (room.getType().equalsIgnoreCase(type) && room.isAvailable()) {
                return room;
            }
        }
        return null;
    }

    public Reservation makeReservation(String reservationId, Guest guest, String roomType, Date checkIn, Date checkOut) {
        Room room = findAvailableRoom(roomType);
        if (room != null) {
            room.setAvailability(false);
            Reservation reservation = new Reservation(reservationId, guest, room, checkIn, checkOut);
            reservations.add(reservation);
            return reservation;
        }
        return null;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }
}
