
package com.mycompany.prblm_2;

// Room.java
public class Room {
    private String roomNumber;
    private String type; // e.g., Single, Double, Suite
    private double price;
    private boolean isAvailable;

    public Room(String roomNumber, String type, double price) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.price = price;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailability(boolean availability) {
        this.isAvailable = availability;
    }

    public double getPrice() {
        return price;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getType() {
        return type;
    }
}
