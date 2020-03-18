import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest;

    @Before
    public void before(){
        guest = new Guest("Joe Bloggs");
    }

//    @Test
//    public void checkGuestPresent(){
//        assertEquals(1, guest.count());
//    }

}
