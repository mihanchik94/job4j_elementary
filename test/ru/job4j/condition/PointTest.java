package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;


public class PointTest {

    @Test
    public void whenDistance() {
        int in1 = 0;
        int in2 = 0;
        int in3 = 2;
        int in4 = 0;
        double expected = 2.0;
        double out = Point.distance(in1, in2, in3, in4);
        Assert.assertEquals(expected, out, 0.01);
    }
}