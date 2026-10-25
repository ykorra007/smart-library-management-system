package com.ylli.library.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.ylli.library.model.User;

public class LibraryServiceTest {

    @Test
    public void testProjectRuns() {

        assertTrue(true);

    }

    @Test
    public void userShouldBeCreated() {

        User user = new User("Ylli");

        assertEquals(
                "Ylli",
                user.getName());
    }
}