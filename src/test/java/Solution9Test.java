import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution9Test {

    @Test
    void SwapMaxNumberInArrayOnZeroTest1() {
            int [] expected = {1,5,7,4,8,0,9,12};
            int [] actual = Solution9.SwapMaxNumberInArrayOnZero(new int[] {1,5,7,4,8,16,9,12});
            assertArrayEquals(expected, actual);
        }
    @Test
    void SwapMaxNumberInArrayOnZeroTest2() {
        int [] expected = {1,5,0,4,28,0,9,28};
        int [] actual = Solution9.SwapMaxNumberInArrayOnZero(new int[] {1,5,28,4,28,0,9,28});
        assertArrayEquals(expected, actual);
    }
    }
