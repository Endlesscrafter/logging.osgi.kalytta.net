package net.kalytta.osgi.logging;

public interface LoggingInterface {

    void fatal(String module, String message);
    void error(String module, String message);
    void warn(String module, String message);
    void info(String module, String message);
    void debug(String module, String message);
    void trace(String module, String message);


}
