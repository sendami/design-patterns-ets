package org.tw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RubberDuckTest {
    RubberDuck duck;
    @BeforeEach
    public void setup() {
        duck = new RubberDuck();
    }
    @Test
    public void shouldQuack() {
        assertEquals("squeak!!", duck.quack());
    }
    @Test
    public void shouldSwim() {
        assertEquals("swimming!!", duck.swim());
    }

    @Test
    public void shouldDisplay() {
        assertEquals("Display Rubber duck!", duck.display());
    }

    @Test
    public void shouldFly() {
       assertNull(duck.fly());
    }
}
