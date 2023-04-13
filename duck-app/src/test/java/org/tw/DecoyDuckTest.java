package org.tw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DecoyDuckTest {
    Duck duck;
    @BeforeEach
    public void setup() {
        duck = new DecoyDuck();
    }
    @Test
    public void shouldSwim() {
        assertEquals("swimming!!", duck.swim());
    }

    @Test
    public void shouldDisplay() {
        assertEquals("Display Decoy duck!", duck.display());
    }

    @Test
    public void shouldNotQuack() {
        assertNull(duck.performQuack());
    }

    @Test
    public void shouldNotFly() {
        assertNull(duck.performFly());
    }
}
