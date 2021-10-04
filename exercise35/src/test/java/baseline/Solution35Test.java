package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test {
    @Test
    void test_if_correct_list_is_returned() {
        Solution35 app = new Solution35();
        ArrayList<String> names = new ArrayList<>();
        names.add("Homer");
        names.add("Bart");
        ArrayList<String> expected = app.promptUser();
        assertEquals(names, expected);

    }

}