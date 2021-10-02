package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {
    @Test
    public void test_passwordValidator() {
        Solution25 app = new Solution25();
        String s1 = "12345";
        int length = app.passwordValidator(s1);
        assertEquals(5,length);
    }

    @Test
    public void test_judgeValue() {
        Solution25 app = new Solution25();
        String s1 = "12345";
        int length = app.passwordValidator(s1);
        String judgement = app.judgeValue(length, s1);
        String s2 = "Very Weak";
        assertEquals(s2, judgement);

    }

}