import Hotel.Guest;
import Hotel.Rooms.DiningRoom;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DiningRoomTest {

    DiningRoom diningroom;
    Guest guest1, guest2;

    @Before
    public void before() {
        diningroom = new DiningRoom(1, 1);
        guest1 = new Guest("Stuart Hogg");
        guest2 = new Guest("Finn Russell");
    }

    @Test
    public void hasNumber() {
        assertEquals(1, diningroom.getNumber());
    }

    @Test
    public void hasCapacity() {
        assertEquals(1, diningroom.getCapacity());
    }

    @Test
    public void canAddGuest() {
        diningroom.add(guest1);
        assertEquals(1, diningroom.countGuests());
    }

    @Test
    public void canRemoveGuest() {
        diningroom.add(guest1);
        diningroom.remove(guest1);
        assertEquals(0, diningroom.countGuests());
    }

    @Test
    public void canGetGuests() {
        diningroom.add(guest1);
        diningroom.add(guest2);
        assertEquals(Arrays.asList(guest1, guest2), diningroom.getGuests());
    }

    @Test
    public void checkRoomNotFull() {
        assertFalse(diningroom.isFull());
    }

    @Test
    public void checkRoomFull() {
        diningroom.add(guest1);
        assertTrue(diningroom.isFull());
    }

    @Test
    public void checkRoomVacant() {
        assertTrue(diningroom.isVacant());
    }

}
