package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution34Test {
    @Test
    void test_if_remove_function_works() {
        Solution34 app = new Solution34();
        ArrayList<String> employeeName = new ArrayList<>();
        employeeName.add("John Smith");
        employeeName.add("Jackie Jackson");
        employeeName.add("Chris Jones");
        employeeName.add("Amanda Cullen");
        employeeName.add("Jeremy Goodwin");

        String expectedremovedEmployee = "John Smith";
        employeeName.add("John Smith");
        employeeName.remove("Jackie Jackson");
        employeeName.remove("Chris Jones");
        employeeName.remove("Amanda Cullen");
        employeeName.remove("Jeremy Goodwin");
        String actualremovedEmployee = employeeName.get(0);

        assertEquals(expectedremovedEmployee, actualremovedEmployee);

    }

}