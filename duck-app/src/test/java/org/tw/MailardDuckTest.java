package org.tw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MailardDuckTest {
    MailardDuck duck;
    @BeforeEach
    public void setup() {
        duck = new MailardDuck();
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


        assertEquals("Display MailardDuck!", duck.display());
    }

    @Test
    public void shouldFly() {
        assertEquals("flying!!", duck.fly());
    }
}
