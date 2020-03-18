import java.util.ArrayList;

public class ConferenceRoom {

    private String roomName;
    private int capacity;
    private ArrayList<Guest> occupants;
    private boolean teleConf;

    public ConferenceRoom(String roomName, int capacity, boolean teleConf){
        this.roomName = roomName;
        this.capacity = capacity;
        this.occupants = new ArrayList<Guest>();
        this.teleConf = teleConf;
    }

    public void addOccupant(Guest guest){
        this.occupants.add(guest);
    }

    public int countGuests() {
        return occupants.size();
    }




}
