import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom1;
    private Guest guest1;

    @Before
    public void before(){
//        bedroom1 = new Bedroom(1, 4, "double");
    }

    @Test
    public void addOccupant(){
        bedroom1 = new Bedroom(1, 4, "double" );
        guest1 = new Guest("Craig");
        bedroom1.addOccupant(guest1);
        assertEquals(1, bedroom1.countGuests());
    }

//    @Test
//    public void checkRoomCount(){
//        assertEquals(1, occupants.addGuest());
//    }
}