package org.example.logger;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class AbstractLogWriter {

    protected static String propertiesFile = "./src/main/resources/logConfig.properties";

    protected static LoggerConfiguration loggerConfig = new FileLoggerConfigurationLoader().loadConfig(propertiesFile);
    protected static File sourceDir = loggerConfig.FILE();
    protected static String fileFormat = loggerConfig.FORMAT();
    protected static long maxFileSize = loggerConfig.MAX_SIZE();
    protected static LoggingLevel loggingLevel = loggerConfig.LOGGING_LEVEL();

    protected static final String DATE = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yy"));
    protected static final String CURRENT_TIME = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    protected static final String MESSAGE_TEMPLATE = "[%s_%s][%s]%s\n";


    public abstract void writeLog(String message);
}
