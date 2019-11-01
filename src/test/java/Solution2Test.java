import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    @Test
    void arrayOfIndexZeroElementsTest1() {
        int[] expected = new int[]{1, 4, 5};
        int[] actual = Solution2.ArrayOfIndexZeroElements( new int [] {1,0,1,4,0,0,8});
        assertArrayEquals(expected, actual);
    }

    @Test
    void arrayOfIndexZeroElementsTest2() {
        int[] expected = new int[]{0,1, 2, 3};
        int[] actual = Solution2.ArrayOfIndexZeroElements( new int [] {0,0,0,0});
        assertArrayEquals(expected, actual);
    }

}