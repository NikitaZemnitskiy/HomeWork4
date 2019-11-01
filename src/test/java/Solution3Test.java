import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution3Test {

    @Test
    void isFirstPositiveNumberTest1() {
        boolean expected = true;
        boolean actual = Solution3.isFirstPositiveNumber( new int[] {1,2,3,4,5});
        assertEquals(expected, actual);
    }

    @Test
    void isFirstPositiveNumberTest2() {
        boolean expected = false;
        boolean actual = Solution3.isFirstPositiveNumber( new int[] {-1,2,3,4,5});
        assertEquals(expected, actual);
    }
    @Test
    void isFirstPositiveNumberTest3() {
        boolean expected = true;
        boolean actual = Solution3.isFirstPositiveNumber( new int[] {0,0,0,1,2,3,4,5});
        assertEquals(expected, actual);
    }

    @Test
    void isFirstPositiveNumberTest4() {
        boolean expected = false;
        boolean actual = Solution3.isFirstPositiveNumber( new int[] {0,0,0,-1,2,3,4,5});
        assertEquals(expected, actual);
    }
}