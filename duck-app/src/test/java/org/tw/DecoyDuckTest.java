package org.tw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DecoyDuckTest {
    DecoyDuck duck;
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
}
