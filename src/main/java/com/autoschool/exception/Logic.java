package com.autoschool.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Logic {

    private static final Logger LOGGER = (Logger) LogManager.getLogger();

    private void privateMethod() {
        LOGGER.info("This is a privateMethod");
    }

    public void publicMethod() {
        LOGGER.info("This is a publicMethod");
        privateMethod();
    }

    public void threadMethod() throws InterruptedException {
        LOGGER.info("Sleep");
        Thread.sleep(3000);
    }
}