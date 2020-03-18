import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> rooms;
    private ArrayList<ConferenceRoom> confRooms;

    public Hotel(){
        rooms = new ArrayList<Bedroom>();
        confRooms = new ArrayList<ConferenceRoom>();
    }

    public void checkInGuest(Guest guest, Bedroom rooms){
        rooms.addOccupant(guest);
    }

    public void addGuestToMeetingRoom(Guest guest, ConferenceRoom confRooms){
        confRooms.addOccupant(guest);
    }


}
