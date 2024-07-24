package vtaras.leetcode.problems.easy.p69;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SqrtXTest {

    @Test
    void testMySqrt() {
        SqrtX sqrtX = new SqrtX();

        Assertions.assertEquals(2, sqrtX.mySqrt(4));
        Assertions.assertEquals(1, sqrtX.mySqrt(1));
        Assertions.assertEquals(2, sqrtX.mySqrt(8));
        Assertions.assertEquals(3, sqrtX.mySqrt(9));
        Assertions.assertEquals(5, sqrtX.mySqrt(25));
        Assertions.assertEquals(0, sqrtX.mySqrt(0));
    }
}
