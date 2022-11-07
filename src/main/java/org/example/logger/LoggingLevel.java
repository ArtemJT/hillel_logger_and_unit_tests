package org.example.logger;

public enum LoggingLevel {

    INFO("[INFO MESSAGE]"),
    DEBUG(INFO.getMessage() + "[DEBUG MESSAGE]");

    private String message;

    LoggingLevel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
