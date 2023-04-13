package org.tw;

import org.junit.jupiter.api.Test;
import org.tw.RedheadDuck;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RedheadDuckTest {

    @Test
    public void shouldQuack() {
        RedheadDuck duck = new RedheadDuck();

        assertEquals("quack!", duck.quack());
    }

    @Test
    public void shouldSwim() {
        RedheadDuck duck = new RedheadDuck();

        assertEquals("swimming!!", duck.swim());
    }

    @Test
    public void shouldDisplay() {
        RedheadDuck duck = new RedheadDuck();

        assertEquals("Display RedheadDuck!", duck.display());
    }
}
