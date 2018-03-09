package Hotel.Rooms;

public class ConferenceRoom extends Room {

    private String name;
    private double rate;

    public ConferenceRoom(int number, int capacity, double rate, String name) {
        super(number, capacity);
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return this.name;
    }

    public double getRate() {
        return this.rate;
    }

}
