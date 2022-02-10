import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArenaTest {

    Robot obj = new Robot("bob");
    Robot obj1 = new Robot("bobby");
    @Test
    void fight() {

        assertEquals(obj1,obj);
    }

}