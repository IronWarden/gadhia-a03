package baseline;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {
    @Test
    public void test_calc_sum_is_correct() {
        Solution28 app = new Solution28();
        int sum = 15;

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);

        integerArrayList.add(5);

        int summation = app.calcSum(integerArrayList);
        assertEquals(sum, summation);
    }
}