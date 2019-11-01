import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution4Test {

    @Test
    void isArrayProgressiveTest1() {
            boolean expected = true;
            boolean actual = Solution4.isArrayProgressive( new int[] {1,2,3,4,5});
            assertEquals(expected, actual);
        }
    @Test

    void isArrayProgressiveTest2() {
        boolean expected = false;
        boolean actual = Solution4.isArrayProgressive( new int[] {1,2,1,4,5});
        assertEquals(expected, actual);
    }

    @Test
    void isArrayProgressiveTest3() {
        boolean expected = true;
        boolean actual = Solution4.isArrayProgressive( new int[] {1,2,2,3,3,4,4,6,8});
        assertEquals(expected, actual);
    }
    }
