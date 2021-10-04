package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {
    @Test
    void test_if_answer_is_random() {
        Solution33 app = new Solution33();
        ArrayList<String> choices = new ArrayList<>();
        choices.add("Yes");
        choices.add("No");
        choices.add("Maybe");
        choices.add("Ask again later");
        int number = 1 + (int)(4 * Math.random());
        String expectedAnswer = "Yes";
        String actualAnswer = app.answer(choices, 0);
        assertEquals(expectedAnswer, actualAnswer);
    }

}