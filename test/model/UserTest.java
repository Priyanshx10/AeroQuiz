package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    void testDefaultConstructor() {

        User user = new User();

        assertNotNull(user);
    }

    @Test
    void testParameterizedConstructor() {

        User user = new User("Priyansh");

        assertEquals("Priyansh", user.getName());
    }

    @Test
    void testSetName() {

        User user = new User();

        user.setName("Ansh");

        assertEquals("Ansh", user.getName());
    }

    @Test
    void testNameIsNotNull() {

        User user = new User("Java");

        assertNotNull(user.getName());
    }
}