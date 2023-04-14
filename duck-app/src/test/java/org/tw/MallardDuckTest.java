package org.tw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MallardDuckTest {
    MallardDuck duck;
    @BeforeEach
    public void setup() {
        duck = new MallardDuck();
    }

    @Test
    public void shouldSwim() {
        assertEquals("swimming!!", duck.swim());
    }

    @Test
    public void shouldDisplay() {
        assertEquals("Display MallardDuck!", duck.display());
    }

    @Test
    public void shouldFly() {
        assertEquals("flying!", duck.fly());
    }
}
