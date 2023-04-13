package org.tw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ModelDuckTest {
    Duck modelDuck;
    @BeforeEach
    public void setup() {
        modelDuck = new ModelDuck();
    }
    @Test
    public void shouldDisplayItsAModelDuck() {
        assertEquals("It's a Model duck", modelDuck.display());
    }

    @Test
    public void shouldNotFlyBeforeSettingFlyBehaviour() {
        assertNull(modelDuck.performFly());
    }

    @Test
    public void shouldFlyInARocketAfterSettingFlyBehaviourAsRocketPowered() {
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        assertEquals("I'm flying with a rocket!", modelDuck.performFly());
    }

    @Test
    public void shouldQuack() {
        assertEquals("quack!", modelDuck.performQuack());
    }
}
