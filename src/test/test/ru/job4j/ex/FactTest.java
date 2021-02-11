package ru.job4j.ex;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNumberLessZeroThenFinish() {
        Fact.calc(-3);
    }

    @Test
    public void when4Then24() {
        int rsl = Fact.calc(4);
        assertThat(rsl, is(24));
    }
}