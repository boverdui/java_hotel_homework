import Hotel.Guest;
import Hotel.Rooms.ConferenceRoom;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ConferenceRoomTest {

    ConferenceRoom conferenceroom;
    Guest guest1, guest2;

    @Before
    public void before() {
        conferenceroom = new ConferenceRoom(1, 1, 500.00, "Edinburgh");
        guest1 = new Guest("Stuart Hogg");
        guest2 = new Guest("Finn Russell");
    }

    @Test
    public void hasNumber() {
        assertEquals(1, conferenceroom.getNumber());
    }

    @Test
    public void hasCapacity() {
        assertEquals(1, conferenceroom.getCapacity());
    }

    @Test
    public void canAddGuest() {
        conferenceroom.add(guest1);
        assertEquals(1, conferenceroom.countGuests());
    }

    @Test
    public void canRemoveGuest() {
        conferenceroom.add(guest1);
        conferenceroom.remove(guest1);
        assertEquals(0, conferenceroom.countGuests());
    }

    @Test
    public void canGetGuests() {
        conferenceroom.add(guest1);
        conferenceroom.add(guest2);
        assertEquals(Arrays.asList(guest1, guest2), conferenceroom.getGuests());
    }

    @Test
    public void checkRoomFull() {
        conferenceroom.add(guest1);
        assertTrue(conferenceroom.isFull());
    }

    @Test
    public void checkRoomNotFull() {
        assertFalse(conferenceroom.isFull());
    }

    @Test
    public void hasRate() {
        assertEquals(500.00, conferenceroom.getRate(), 0.01);
    }

    @Test
    public void hasName() {
        assertEquals("Edinburgh", conferenceroom.getName());
    }

}
