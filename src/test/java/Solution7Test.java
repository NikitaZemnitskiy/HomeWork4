import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution7Test {

    @Test
    void nextSimpleNumberTest1() {
        int expected = 3;
        int actual = Solution7.nextSimpleNumber(5);
        assertEquals(expected, actual);
    }

    @Test
    void nextSimpleNumberTest2() {
        int expected = 6421;
        int actual = Solution7.nextSimpleNumber(6397);
        assertEquals(expected, actual);
    }

    @Test
    void nextSimpleNumberTest3() {
        int expected = 9973;
        int actual = Solution7.nextSimpleNumber(9967);
        assertEquals(expected, actual);
    }
}