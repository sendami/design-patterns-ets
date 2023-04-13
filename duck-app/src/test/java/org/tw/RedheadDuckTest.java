package org.tw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RedheadDuckTest {
    RedheadDuck duck;
    @BeforeEach
    public void setup() {
        duck = new RedheadDuck();
    }
    @Test
    public void shouldQuack() {
        assertEquals("quack!", duck.quack());
    }


    @Test
    public void shouldSwim() {
        assertEquals("swimming!!", duck.swim());
    }

    @Test
    public void shouldDisplay() {
        assertEquals("Display RedheadDuck!", duck.display());
    }

    @Test
    public void shouldFly() {
        assertEquals("Redhead duck flying!", duck.fly());
    }
}
