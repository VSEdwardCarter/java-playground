package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Echo_test {
    @Test
    public void testShoutReturnsUpperCase() {

        //Setup
        Echo echo = new Echo();
        // execution
        String result = echo.shout("Hello");

        //assertions
        assertEquals("HELLO!", result);
    }
}