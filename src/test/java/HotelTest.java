import org.junit.Before;
import org.junit.Test;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private Guest guest;
    private ConferenceRoom confRoom1;

    @Before
    public void before(){
        bedroom1 = new Bedroom(1, 2,  "single");
        guest = new Guest("Craig");
        hotel = new Hotel();
        confRoom1 = new ConferenceRoom("The Royal Suite", 350, true);
    }

    @Test
    public void checkIn(){
        hotel.checkInGuest(guest, bedroom1);
    }

    @Test
    public void addToConfRoom(){
        confRoom1.addOccupant(guest);
    }

}
