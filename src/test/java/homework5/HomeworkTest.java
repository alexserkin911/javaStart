package homework5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeworkTest {

    @Test
    public void test1() {
        HW hw5 = new HW();
        Assertions.assertTrue(hw5.checkArray(new int[]{1, 2, 3, 5, 1}));
    }

    @Test
    public void test2() {
        HW hw5 = new HW();
        Assertions.assertFalse(hw5.checkArray(new int[]{1, 2, 3, 5, 4}));
    }

}
