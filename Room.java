public class Room { // POJO class
    private String id;
    private boolean isMale; // no sexist we are doing the best with Java limitations
    private int floor;
    private boolean aircon;
    private int house; // 0 to 4, 
    private int suite; // 0 to 8, 0 for corridor, 1-8 represents suites

    public String getId() {
        return this.id;
    }

    public boolean getIsMale() {
        return this.isMale();
    } 

    public int getFloor() {
        return this.floor;
    }

    public boolean getAircon() {
        return this.aircon;
    }

    public int getHouse() {
        return this.house;
    }

    public int getSuite() {
        return this.suite;
    }
}