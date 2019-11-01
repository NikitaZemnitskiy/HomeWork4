import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class Solution8Test {

    @Test
    void arrayElementsThatArePowersOfTwoTest1() {
            Object [] expected = {1,4,8,16};
            Object [] actual = Solution8.ArrayElementsThatArePowersOfTwo( new int[] {1,5,7,4,8,16});
            assertArrayEquals(expected, actual);
        }


    @Test
    void arrayElementsThatArePowersOfTwoTest2() {
        Object [] expected = {1,4,8,16,32,64,128,256};
        Object [] actual = Solution8.ArrayElementsThatArePowersOfTwo( new int[] {1,5,7,4,8,16,7,32,9,64,0,128,93,256});
        assertArrayEquals(expected, actual);
    }
}
