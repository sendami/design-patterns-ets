package org.tw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MallardDuckTest {
    Duck duck;
    @BeforeEach
    public void setup() {
        duck = new MallardDuck();
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
        assertEquals("Display MallardDuck!", duck.display());
    }

    @Test
    public void shouldFly() {
        assertEquals("flying!", duck.fly());
    }
}
