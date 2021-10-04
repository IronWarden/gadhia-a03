package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {
    @Test
    void calc_heart_rate() {
        Solution31 app = new Solution31();
        int expected = 138;
        int actual = app.calcHeartRate(23, 65, .55 );
        assertEquals(expected, actual);
    }

}