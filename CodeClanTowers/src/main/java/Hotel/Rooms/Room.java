package Hotel.Rooms;

import Hotel.Guest;

import java.util.ArrayList;

public class Room {

    private int number;
    private int capacity;
    ArrayList<Guest> guests;

    public Room(int number, int capacity) {
        this.number = number;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getNumber() {
        return this.number;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int countGuests() {
        return this.guests.size();
    }

    public void add(Guest guest) {
        this.guests.add(guest);
    }

    public void remove(Guest guest) {
        this.guests.remove(guest);
    }

    public ArrayList<Guest> getGuests() {
        return this.guests;
    }

    public boolean isFull() {
        return this.guests.size() >= this.capacity;
    }

}
