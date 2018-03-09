package Hotel.Rooms;

public class BedRoom extends Room {

    private Type type;
    private double rate;

    public BedRoom(int number, int capacity, Type type, double rate) {
        super(number, capacity);
        this.type = type;
        this.rate = rate;
    }

    public Type getType() {
        return this.type;
    }

    public double getRate() {
        return this.rate;
    }

}
