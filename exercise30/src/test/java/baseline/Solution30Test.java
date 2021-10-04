package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution30Test {
    @Test
    void test_calc() {
        Solution30 app = new Solution30();
        int row = 10;
        int col = 10;
        int expected = 100;
        int actual = app.calcTable(row, col);

        assertEquals(expected, actual);
    }

}