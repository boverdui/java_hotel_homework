import Hotel.Guest;
import Hotel.Rooms.Room;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class RoomTest {

    Room room;
    Guest guest1, guest2;

    @Before
    public void before() {
        room = new Room(1, 1);
        guest1 = new Guest("Stuart Hogg");
        guest2 = new Guest("Finn Russell");
    }

    @Test
    public void hasNumber() {
        assertEquals(1, room.getNumber());
    }

    @Test
    public void hasCapacity() {
        assertEquals(1, room.getCapacity());
    }

    @Test
    public void canAddGuest() {
        room.add(guest1);
        assertEquals(1, room.countGuests());
    }

    @Test
    public void canRemoveGuest() {
        room.add(guest1);
        room.remove(guest1);
        assertEquals(0, room.countGuests());
    }

    @Test
    public void canGetGuests() {
        room.add(guest1);
        room.add(guest2);
        assertEquals(Arrays.asList(guest1, guest2), room.getGuests());
    }

    @Test
    public void checkRoomFull() {
        room.add(guest1);
        assertTrue(room.isFull());
    }

    @Test
    public void checkRoomNotFull() {
        assertFalse(room.isFull());
    }

    @Test
    public void checkRoomVacant() {
        assertTrue(room.isVacant());
    }

}
