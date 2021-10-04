package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {
    @Test
    public void test_calculation() {
        Solution29 app = new Solution29();
        int years = 18;
        int actual = app.calcYears(4);

        assertEquals(years, actual);

    }
}