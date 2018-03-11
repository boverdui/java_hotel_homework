import Hotel.Guest;
import Hotel.Hotel;
import Hotel.Rooms.BedRoom;
import Hotel.Rooms.ConferenceRoom;
import Hotel.Rooms.DiningRoom;
import Hotel.Rooms.Type;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    BedRoom bedroom1, bedroom2, bedroom3, bedroom4;
    ConferenceRoom conferenceroom1, conferenceroom2;
    DiningRoom diningroom;
    Guest guest1, guest2, guest3;

    @Before
    public void before() {
        hotel = new Hotel();
        bedroom1 = new BedRoom(1, 1, 100.00, Type.SINGLE);
        bedroom2 = new BedRoom(2, 1, 100.00, Type.SINGLE);
        bedroom3 = new BedRoom(3, 2, 200.00, Type.DOUBLE);
        bedroom4 = new BedRoom(4, 2, 200.00, Type.DOUBLE);
        conferenceroom1 = new ConferenceRoom(1, 2,500.00, "Edinburgh");
        conferenceroom2 = new ConferenceRoom(2, 2, 1000.00, "Glasgow");
        diningroom = new DiningRoom(1,1);
        guest1 = new Guest("Stuart Hogg");
        guest2 = new Guest("Finn Russell");
        guest3 = new Guest("Greig Laidlaw");
    }

    @Test
    public void canAddBedRoom() {
        hotel.addBedRoom(bedroom1);
        assertEquals(1, hotel.countBedRooms());
    }

    @Test
    public void canRemoveBedRoom() {
        hotel.addBedRoom(bedroom1);
        hotel.removeBedRoom(bedroom1);
        assertEquals(0, hotel.countBedRooms());
    }

    @Test
    public void canGetBedRooms() {
        hotel.addBedRoom(bedroom1);
        hotel.addBedRoom(bedroom2);
        hotel.addBedRoom(bedroom3);
        hotel.addBedRoom(bedroom4);
        assertEquals(Arrays.asList(bedroom1, bedroom2, bedroom3, bedroom4), hotel.getBedRooms());
    }

    @Test
    public void canCheckInGuestToBedRoom() {
        hotel.addBedRoom(bedroom1);
        hotel.checkInBedRoom(bedroom1, guest1);
        assertEquals(1, bedroom1.countGuests());
    }

    @Test
    public void cannotCheckInGuestToFullBedRoom() {
        hotel.addBedRoom(bedroom1);
        hotel.checkInBedRoom(bedroom3, guest1);
        hotel.checkInBedRoom(bedroom3, guest2);
        hotel.checkInBedRoom(bedroom3, guest3);
        assertEquals(2, bedroom3.countGuests());
    }

    @Test
    public void canCheckOutGuestFromBedRoom() {
        hotel.addBedRoom(bedroom1);
        hotel.checkInBedRoom(bedroom1, guest1);
        hotel.checkOutBedRoom(bedroom1, guest1);
        assertEquals(0, bedroom1.countGuests());
    }

    @Test
    public void canGetVacantBedRooms() {
        hotel.addBedRoom(bedroom1);
        hotel.addBedRoom(bedroom2);
        hotel.addBedRoom(bedroom3);
        hotel.addBedRoom(bedroom4);
        hotel.checkInBedRoom(bedroom1, guest3);
        hotel.checkInBedRoom(bedroom3, guest1);
        hotel.checkInBedRoom(bedroom3, guest2);
        assertEquals(Arrays.asList(bedroom2, bedroom4), hotel.getVacantBedRooms());
    }

    @Test
    public void canAddConferenceRoom() {
        hotel.addConferenceRoom(conferenceroom1);
        assertEquals(1, hotel.countConferenceRooms());
    }

    @Test
    public void canRemoveConferenceroom() {
        hotel.addConferenceRoom(conferenceroom1);
        hotel.removeConferenceRoom(conferenceroom1);
        assertEquals(0, hotel.countConferenceRooms());
    }

    @Test
    public void canGetConferenceRooms() {
        hotel.addConferenceRoom(conferenceroom1);
        hotel.addConferenceRoom(conferenceroom2);
        assertEquals(Arrays.asList(conferenceroom1, conferenceroom2), hotel.getConferenceRooms());
    }

    @Test
    public void canCheckInGuestToConferenceRoom() {
        hotel.addConferenceRoom(conferenceroom1);
        hotel.checkInConferenceRoom(conferenceroom1, guest1);
        assertEquals(1, conferenceroom1.countGuests());
    }

    @Test
    public void cannotCheckInGuestToFullConferenceRoom() {
        hotel.addConferenceRoom(conferenceroom1);
        hotel.checkInConferenceRoom(conferenceroom1, guest1);
        hotel.checkInConferenceRoom(conferenceroom1, guest2);
        hotel.checkInConferenceRoom(conferenceroom1, guest3);
        assertEquals(2, conferenceroom1.countGuests());
    }

    @Test
    public void canCheckOutGuestFromConferenceRoom() {
        hotel.addConferenceRoom(conferenceroom1);
        hotel.checkInConferenceRoom(conferenceroom1, guest1);
        hotel.checkOutConferenceRoom(conferenceroom1, guest1);
        assertEquals(0, conferenceroom1.countGuests());
    }

    @Test
    public void canAddDiningRoom() {
        hotel.addDiningRoom(diningroom);
        assertEquals(1, hotel.countDiningRooms());
    }

    @Test
    public void canRemoveDiningRoom() {
        hotel.addDiningRoom(diningroom);
        hotel.removeDiningRoom(diningroom);
        assertEquals(0, hotel.countDiningRooms());
    }

    @Test
    public void canGetDiningRooms() {
        hotel.addDiningRoom(diningroom);
        assertEquals(Arrays.asList(diningroom), hotel.getDiningRooms());
    }

    @Test
    public void canCheckInGuestToDiningRoom() {
        hotel.addDiningRoom(diningroom);
        hotel.checkInDiningRoom(diningroom, guest1);
        assertEquals(1, diningroom.countGuests());
    }

    @Test
    public void cannotCheckInGuestToFullDiningRoom() {
        hotel.addDiningRoom(diningroom);
        hotel.checkInDiningRoom(diningroom, guest1);
        hotel.checkInDiningRoom(diningroom, guest2);
        assertEquals(1, diningroom.countGuests());
    }

    @Test
    public void canCheckOutGuestFromDiningRoom() {
        hotel.addDiningRoom(diningroom);
        hotel.checkInDiningRoom(diningroom, guest1);
        hotel.checkOutDiningRoom(diningroom, guest1);
        assertEquals(0, diningroom.countGuests());
    }

}
