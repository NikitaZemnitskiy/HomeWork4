import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution6Test {

    @Test
    void summMaxEvenNumberAndMinOddNumberTest1() {
            int expected = 5;
            int actual = Solution6.summMaxEvenNumberAndMinOddNumber( new int[] {1,2,3,4,5});
            assertEquals(expected, actual);
        }

    @Test
    void summMaxEvenNumberAndMinOddNumberTest2() {
        int expected = 13;
        int actual = Solution6.summMaxEvenNumberAndMinOddNumber( new int[] {6,10,5,3,9,5});
        assertEquals(expected, actual);
    }
    }
