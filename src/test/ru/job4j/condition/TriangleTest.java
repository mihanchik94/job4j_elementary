package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@SuppressWarnings("checkstyle:WhitespaceAround")
public class TriangleTest {


    /**
     * double выдает примерные значения, поэтому получить ровно 4.5 не представляется возможным
     */
    @Test
    public void whenSetThreePointsThenTriangleArea() {
        Point first = new Point(0, 0);
        Point second = new Point(3, 0);
        Point third = new Point(4, 3);
        Triangle triangle = new Triangle(first, second, third);
        double result = triangle.area();
        double expected = 4.500000000000002;
        assertThat(result, is(expected));
    }
}

