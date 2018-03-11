package Hotel.Rooms;

public class ConferenceRoom extends Room {

    private double rate;
    private String name;

    public ConferenceRoom(int number, int capacity, double rate, String name) {
        super(number, capacity);
        this.rate = rate;
        this.name = name;
    }

    public double getRate() {
        return this.rate;
    }

    public String getName() {
        return this.name;
    }

}
