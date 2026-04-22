import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestJUnit2 {

    @Test
    void testCount8() {
        assertEquals(1, TestingRecursion2.count8(8));
        assertEquals(2, TestingRecursion2.count8(818));
        assertEquals(4, TestingRecursion2.count8(8818));
        assertEquals(0, TestingRecursion2.count8(123));
        assertEquals(9, TestingRecursion2.count8(88888)); // (2+2+2+2+1)
    }

    @Test
    void testCountHi() {
        assertEquals(1, TestingRecursion2.countHi("xxhixx"));
        assertEquals(2, TestingRecursion2.countHi("xhixhix"));
        assertEquals(1, TestingRecursion2.countHi("hi"));
        assertEquals(0, TestingRecursion2.countHi("hello"));
        assertEquals(3, TestingRecursion2.countHi("hihihi"));
    }

    @Test
    void testCountHi2() {
        assertEquals(1, TestingRecursion2.countHi2("ahixhi"));
        assertEquals(2, TestingRecursion2.countHi2("ahibhi"));
        assertEquals(0, TestingRecursion2.countHi2("xhixhi"));
        assertEquals(1, TestingRecursion2.countHi2("hixhi"));
        assertEquals(0, TestingRecursion2.countHi2("xhi"));
    }

    @Test
    void testStrCount() {
        assertEquals(2, TestingRecursion2.strCount("catcowcat", "cat"));
        assertEquals(1, TestingRecursion2.strCount("catcowcat", "cow"));
        assertEquals(0, TestingRecursion2.strCount("catcowcat", "dog"));
        assertEquals(3, TestingRecursion2.strCount("aaababab", "ab"));
        assertEquals(2, TestingRecursion2.strCount("iiiijjj", "ii")); // Non-overlapping
    }

    @Test
    void testStringClean() {
        assertEquals("yza", TestingRecursion2.stringClean("yyzzza"));
        assertEquals("abcd", TestingRecursion2.stringClean("abbbcdd"));
        assertEquals("Helo", TestingRecursion2.stringClean("Hello"));
        assertEquals("X", TestingRecursion2.stringClean("XXXXX"));
        assertEquals("abc", TestingRecursion2.stringClean("abc"));
    }
}