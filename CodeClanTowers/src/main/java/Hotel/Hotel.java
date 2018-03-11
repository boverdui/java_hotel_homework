package Hotel;

import Hotel.Rooms.BedRoom;
import Hotel.Rooms.ConferenceRoom;
import Hotel.Rooms.DiningRoom;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<BedRoom> bedrooms;
    private ArrayList<ConferenceRoom> conferencerooms;
    private ArrayList<DiningRoom> diningrooms;

    public Hotel() {
        this.bedrooms = new ArrayList<>();
        this.conferencerooms = new ArrayList<>();
        this.diningrooms = new ArrayList<>();
    }

    public void addBedRoom(BedRoom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void removeBedRoom(BedRoom bedroom) {
        this.bedrooms.remove(bedroom);
    }

    public int countBedRooms() {
        return this.bedrooms.size();
    }

    public ArrayList<BedRoom> getBedRooms() {
        return this.bedrooms;
    }

    public void checkInBedRoom(BedRoom bedroom, Guest guest) {
        if(!bedroom.isFull()) {
            bedroom.add(guest);
        }
    }

    public void checkOutBedRoom(BedRoom bedroom, Guest guest) {
        bedroom.remove(guest);
    }

    public ArrayList<BedRoom> getVacantBedRooms() {
        ArrayList<BedRoom> vacantbedrooms = new ArrayList<BedRoom>();
        for (BedRoom bedroom : bedrooms) {
            if (bedroom.isVacant()) {
                vacantbedrooms.add(bedroom);
            }
        }
        return vacantbedrooms;
    }

    public void addConferenceRoom(ConferenceRoom conferenceroom) {
        this.conferencerooms.add(conferenceroom);
    }

    public void removeConferenceRoom(ConferenceRoom conferenceroom) {
        this.conferencerooms.remove(conferenceroom);
    }

    public int countConferenceRooms() {
        return this.conferencerooms.size();
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return this.conferencerooms;
    }

    public void checkInConferenceRoom(ConferenceRoom conferenceroom, Guest guest) {
        if(!conferenceroom.isFull()) {
            conferenceroom.add(guest);
        }
    }

    public void checkOutConferenceRoom(ConferenceRoom conferenceroom, Guest guest) {
        conferenceroom.remove(guest);
    }

    public void addDiningRoom(DiningRoom diningroom) {
        this.diningrooms.add(diningroom);
    }

    public void removeDiningRoom(DiningRoom diningroom) {
        this.diningrooms.remove(diningroom);
    }

    public int countDiningRooms() {
        return this.diningrooms.size();
    }

    public ArrayList<DiningRoom> getDiningRooms() {
        return this.diningrooms;
    }

    public void checkInDiningRoom(DiningRoom diningroom, Guest guest) {
        if(!diningroom.isFull()) {
            diningroom.add(guest);
        }
    }

    public void checkOutDiningRoom(DiningRoom diningroom, Guest guest) {
        diningroom.remove(guest);
    }

}


