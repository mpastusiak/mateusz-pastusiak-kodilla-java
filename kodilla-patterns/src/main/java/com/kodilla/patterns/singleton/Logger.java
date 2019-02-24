package com.kodilla.patterns.singleton;

import java.util.Objects;

public class Logger {
    private static Logger logger = null;
    private static String lastLog = "";

    private Logger() {
    }

    public static Logger getInstance() {
        if (Objects.equals(logger, null)) {
            synchronized (Logger.class) {
                if (Objects.equals(logger, null)) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}