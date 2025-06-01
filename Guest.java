
package com.mycompany.prblm_2;

// Guest.java
public class Guest {
    private String guestId;
    private String name;
    private String phoneNumber;
    private String email;

    public Guest(String guestId, String name, String phoneNumber, String email) {
        this.guestId = guestId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getGuestId() {
        return guestId;
    }

    public String getName() {
        return name;
    }
}
