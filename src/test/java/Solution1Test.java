import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1Test {

    @org.junit.jupiter.api.Test
    void SummTest1() {
        int expected = 28;
        int actual = Solution1.summ( new int[] {1,8,6,2,5,4,8,3,7}, 2);
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void SummTest2() {
        int expected = 15;
        int actual = Solution1.summ( new int[] {1,2,3,4,5}, 1);
        assertEquals(expected, actual);
    }
}