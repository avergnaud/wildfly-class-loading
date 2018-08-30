package com.poc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {
    static Logger logger = LoggerFactory.getLogger(LogTest.class);

    public void log() {
        logger.error("hello world");
    }

}
