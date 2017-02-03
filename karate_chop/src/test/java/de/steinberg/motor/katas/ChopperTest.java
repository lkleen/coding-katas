package de.steinberg.motor.katas;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by lkleen on 2/3/2017.
 */
public class ChopperTest {

    /**

     assert_equal(-1, chop(3, []))
     assert_equal(-1, chop(3, [1]))
     assert_equal(0,  chop(1, [1]))

     assert_equal(0,  chop(1, [1, 3, 5]))
     assert_equal(1,  chop(3, [1, 3, 5]))
     assert_equal(2,  chop(5, [1, 3, 5]))
     assert_equal(-1, chop(0, [1, 3, 5]))
     assert_equal(-1, chop(2, [1, 3, 5]))
     assert_equal(-1, chop(4, [1, 3, 5]))
     assert_equal(-1, chop(6, [1, 3, 5]))

     assert_equal(0,  chop(1, [1, 3, 5, 7]))
     assert_equal(1,  chop(3, [1, 3, 5, 7]))
     assert_equal(2,  chop(5, [1, 3, 5, 7]))
     assert_equal(3,  chop(7, [1, 3, 5, 7]))
     assert_equal(-1, chop(0, [1, 3, 5, 7]))
     assert_equal(-1, chop(2, [1, 3, 5, 7]))
     assert_equal(-1, chop(4, [1, 3, 5, 7]))
     assert_equal(-1, chop(6, [1, 3, 5, 7]))
     assert_equal(-1, chop(8, [1, 3, 5, 7]))

     */

    @Test
    public void test() {
        Assert.assertEquals(-1, Chopper.chop(3, null));
        Assert.assertEquals(-1, Chopper.chop(3, 1));
        Assert.assertEquals(0,  Chopper.chop(1, 1));

        Assert.assertEquals(0,  Chopper.chop(1, 1, 3, 5));
        Assert.assertEquals(1,  Chopper.chop(3, 1, 3, 5));
        Assert.assertEquals(2,  Chopper.chop(5, 1, 3, 5));
        Assert.assertEquals(-1, Chopper.chop(0, 1, 3, 5));
        Assert.assertEquals(-1, Chopper.chop(2, 1, 3, 5));
        Assert.assertEquals(-1, Chopper.chop(4, 1, 3, 5));
        Assert.assertEquals(-1, Chopper.chop(6, 1, 3, 5));

        Assert.assertEquals(0,  Chopper.chop(1, 1, 3, 5, 7));
        Assert.assertEquals(1,  Chopper.chop(3, 1, 3, 5, 7));
        Assert.assertEquals(2,  Chopper.chop(5, 1, 3, 5, 7));
        Assert.assertEquals(3,  Chopper.chop(7, 1, 3, 5, 7));
        Assert.assertEquals(-1, Chopper.chop(0, 1, 3, 5, 7));
        Assert.assertEquals(-1, Chopper.chop(2, 1, 3, 5, 7));
        Assert.assertEquals(-1, Chopper.chop(4, 1, 3, 5, 7));
        Assert.assertEquals(-1, Chopper.chop(6, 1, 3, 5, 7));
        Assert.assertEquals(-1, Chopper.chop(8, 1, 3, 5, 7));
    }

}
