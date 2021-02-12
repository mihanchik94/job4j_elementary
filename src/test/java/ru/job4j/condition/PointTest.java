package ru.job4j.condition;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;


public class PointTest {

    @Test
    public void whenDistance() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        double result = first.distance(second);
        double expected = 2.0;
        assertThat(result, is(expected));
    }
    @Test
    public void whenDistance3D() {
        Point first = new Point(0, 0, 0);
        Point second = new Point(0, 2, 0);
        double result = first.distance3d(second);
        double expected = 2.0;
        assertThat(result, is(expected));
    }

}
