package fibo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FiboTest {
    @Test
    public void f1 ()
    {
        Assert.assertEquals(3, Fibo.f1(4));
        Assert.assertEquals(5, Fibo.f1(5));
        Assert.assertEquals(8, Fibo.f1(6));
    }

    @Test
    public void f2 ()
    {
        Assert.assertEquals(3, Fibo.f1(4));
        Assert.assertEquals(5, Fibo.f1(5));
        Assert.assertEquals(8, Fibo.f1(6));
    }
}
