import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void checkIfNumber3Digits(){
        //given
        int number = 100;
        //when
        Main main = new Main();
        boolean result = main.checkIfNumber3Digits(number);
        //then
        assertTrue(result);
    }

    @Test
    public void checkIfNumberisNot3Digits(){
        //given
        int number = 1000;
        //when
        Main main = new Main();
        boolean result = main.checkIfNumber3Digits(number);
        //then
        assertFalse(result);
    }
}