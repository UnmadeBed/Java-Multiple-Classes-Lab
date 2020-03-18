import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> occupants;
    private String roomType;

    public Bedroom(int roomNumber, int capacity, String roomType){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.occupants = new ArrayList<Guest>();
        this.roomType = roomType;
    }
    
    public void addOccupant(Guest guest){
        this.occupants.add(guest);
    }


    public int countGuests() {
        return occupants.size();
    }
}
