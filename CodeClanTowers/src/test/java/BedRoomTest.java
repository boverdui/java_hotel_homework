import Hotel.Guest;
import Hotel.Rooms.BedRoom;
import Hotel.Rooms.Type;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BedRoomTest {

    BedRoom bedroom;
    Guest guest1, guest2;

    @Before
    public void before() {
        bedroom = new BedRoom(1, 1, 100.00, Type.SINGLE);
        guest1 = new Guest("Stuart Hogg");
        guest2 = new Guest("Finn Russell");
    }

    @Test
    public void hasNumber() {
        assertEquals(1, bedroom.getNumber());
    }

    @Test
    public void hasCapacity() {
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void canAddGuest() {
        bedroom.add(guest1);
        assertEquals(1, bedroom.countGuests());
    }

    @Test
    public void canRemoveGuest() {
        bedroom.add(guest1);
        bedroom.remove(guest1);
        assertEquals(0, bedroom.countGuests());
    }

    @Test
    public void canGetGuests() {
        bedroom.add(guest1);
        bedroom.add(guest2);
        assertEquals(Arrays.asList(guest1, guest2), bedroom.getGuests());
    }

    @Test
    public void checkRoomFull() {
        bedroom.add(guest1);
        assertTrue(bedroom.isFull());
    }

    @Test
    public void checkRoomNotFull() {
        assertFalse(bedroom.isFull());
    }

    @Test
    public void checkRoomVacant() {
        assertTrue(bedroom.isVacant());
    }

    @Test
    public void hasRate() {
        assertEquals(100.00, bedroom.getRate(), 0.01);
    }

    @Test
    public void hasType() {
        assertEquals(Type.SINGLE, bedroom.getType());
    }

}
