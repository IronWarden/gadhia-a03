package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {
    @Test
    public void test_IsAnagram() {
        Solution24 app = new Solution24();
        String s1 = "f";
        String s2 = "lololol";

        boolean isAnagram = app.isAnagram(s1,s2);


        assertEquals(false, isAnagram);

    }

}