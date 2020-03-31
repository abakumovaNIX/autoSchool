package com.autoschool.logging;

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
}
