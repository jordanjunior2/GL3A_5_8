import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {

    Robot obj = new Robot("obj");
    Robot obj1 = new Robot("obj2");

    @Test
    void fire() {
        assertEquals(8,obj.fire(obj1));
    }




    @Test
    void isDead() {

        String attendedmessage = "Est vivant";
        assertEquals(attendedmessage,obj.isDead(8));
    }

    @Test
    void isDead2() {

        String attendedmessage = "Est mort";
        assertEquals(attendedmessage,obj.isDead(0));
    }
}