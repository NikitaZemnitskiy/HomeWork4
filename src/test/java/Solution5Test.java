import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5Test {

    @Test
    void returnedEvenArrayTest1() {
       int[] expected = {2,4};
        int[] actual = Solution5.returnedEvenArray( new int[] {1,2,3,4,5});
        assertArrayEquals(expected, actual);
    }

    @Test
    void returnedEvenArrayTest2() {
        int[] expected = {};
        int[] actual = Solution5.returnedEvenArray( new int[] {1,7,3,9,5});
        assertArrayEquals(expected, actual);
    }

}