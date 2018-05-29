@PlanningEntity
public class Resident {
    private String matric;
    private boolean isMaleResident;
    private String faculty;
    private Integer prevRoom; // null if no prev room
    private int type; // 0 for freshman, 1 for senior, 2 for exchanger
    private int house; // 0 - 5, 0 is no house
    private String nationality;
    
    private int pref1;
    private int pref2;
    private int pref3;
    // 0-3, corridor non-ac, corridor ac, suite non-ac, suite ac respectively

    private boolean lvlPrefSame; // true if same gender, false if mixed gender

    private Room room;

    @PlanningVariable(valueRangeProviderRefs = {"roomRange"}) // need to see if arguments needed for this annotation
    public Room getRoom() {
        return this.room;
    }

    public void setRoom(Room r) {
        this.room = r;
    }

    //Complex methods ...
}