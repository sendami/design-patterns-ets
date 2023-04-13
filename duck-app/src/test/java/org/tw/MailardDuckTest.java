package org.tw;

import org.junit.jupiter.api.Test;
import org.tw.MailardDuck;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MailardDuckTest {

    @Test
    public void shouldQuack() {
        MailardDuck duck = new MailardDuck();

        assertEquals("quack!", duck.quack());
    }

    @Test
    public void shouldSwim() {
        MailardDuck duck = new MailardDuck();

        assertEquals("swimming!!", duck.swim());
    }

    @Test
    public void shouldDisplay() {
        MailardDuck duck = new MailardDuck();

        assertEquals("Display MailardDuck!", duck.display());
    }
}
