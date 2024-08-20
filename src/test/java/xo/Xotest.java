package xo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Xotest {

//    @BeforeAll
//    public void init() {
//        XO.fillMap();
//    }

    @Test
    public void test1() {
        XO.move(0, 0, 'X');
        XO.move(0, 1, 'X');
        XO.move(0, 2, 'X');
        Assertions.assertTrue(XO.isVictory('X'));
    }

    @Test
    public void test2() {
        XO.move(0, 0, 'X');
        XO.move(1, 0, 'X');
        XO.move(2, 0, 'X');
        Assertions.assertTrue(XO.isVictory('X'));
    }

    @Test
    public void test3() {
        XO.move(0, 0, 'X');
        XO.move(1, 1, 'X');
        XO.move(2, 2, 'X');
        Assertions.assertTrue(XO.isVictory('X'));
    }
}
