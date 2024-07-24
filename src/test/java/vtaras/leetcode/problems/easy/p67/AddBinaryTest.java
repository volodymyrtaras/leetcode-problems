package vtaras.leetcode.problems.easy.p67;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddBinaryTest {

    @Test
    void testAddBinary() {
        AddBinary addBinary = new AddBinary();

        Assertions.assertEquals("100", addBinary.addBinary("11", "1"));
        Assertions.assertEquals("10101", addBinary.addBinary("1010", "1011"));
    }
}
