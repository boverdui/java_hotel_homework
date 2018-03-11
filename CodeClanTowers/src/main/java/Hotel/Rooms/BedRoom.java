package Hotel.Rooms;

public class BedRoom extends Room {

    private double rate;
    private Type type;

    public BedRoom(int number, int capacity, double rate, Type type) {
        super(number, capacity);
        this.rate = rate;
        this.type = type;
    }

    public double getRate() {
        return this.rate;
    }

    public Type getType() {
        return this.type;
    }

}
