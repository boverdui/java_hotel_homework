package Hotel.Rooms;

import java.util.ArrayList;

public class BedRoom extends Room {

    private double rate;
    private Type type;

    public BedRoom(int number, int capacity, double rate, Type type) {
        super(number, capacity);
        this.rate = rate;
        this.type = type;
        this.guests = new ArrayList<>();
    }

    public double getRate() {
        return this.rate;
    }

    public Type getType() {
        return this.type;
    }

    public boolean isVacant() {
        return this.guests.size() == 0;
    }

}
