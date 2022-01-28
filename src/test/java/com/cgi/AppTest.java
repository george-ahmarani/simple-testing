package com.cgi;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest
{
    @Test
    public void verifyMessage()
    {
        App app = new App();
        assertTrue(app.getMessage().equals("Hello"));
    }
}
