import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



class StringCalcTest {

    @Test
    void AddTest() {
        //empty string, no numbers test
        assertEquals(0, StringCalc.Add(""));
        //test of one number
        assertEquals(5, StringCalc.Add("5"));
    }
}