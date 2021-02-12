package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void when1To2To3To4Then4() {
        int rsl = Max.max(1, 2, 3, 4);
        assertThat(rsl, is(4));
    }

    @Test
    public void when5To7To6To1Then7() {
        int rsl = Max.max(5, 7, 6, 1);
        assertThat(rsl, is(7));
    }

    @Test
    public void whenAllSame() {
        int rsl = Max.max(1, 1, 1, 1);
        assertThat(rsl, is(1));
    }
}