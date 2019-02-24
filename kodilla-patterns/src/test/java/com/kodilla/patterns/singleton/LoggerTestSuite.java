package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void getLastLog() {
        //Given
        Logger logger = Logger.getInstance();
        //When
        logger.log("TEST log!");
        //Then
        Assert.assertEquals("TEST log!", logger.getLastLog());

    }
}
