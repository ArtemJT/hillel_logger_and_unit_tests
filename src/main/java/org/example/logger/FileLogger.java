package org.example.logger;

public class FileLogger extends FileLogWriter {

    private static FileLogger logger;

    public static FileLogger startLogger(String message) {
        if (logger == null) logger = new FileLogger();

        if (sourceDir.mkdirs()) System.out.println("Log's catalog created in: " + sourceDir);

        String newMessage = '[' + message + ']';
        loggingLevel.setMessage(newMessage);
        final String logMessage = loggingLevel.getMessage();
        switch (loggingLevel) {
            case DEBUG -> logger.debug(logMessage);
            case INFO -> logger.info(logMessage);
        }
        return logger;
    }

    public void debug(String message) {
        writeLog(message);
    }

    public void info(String message) {
        writeLog(message);
    }
}
