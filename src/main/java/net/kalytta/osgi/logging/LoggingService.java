package net.kalytta.osgi.logging;

public class LoggingService implements LoggingInterface {
    public void fatal(String module, String message) {
        LogActivator.getLogger().fatal("[" + module + "] " + message);
    }

    public void error(String module, String message) {
        LogActivator.getLogger().error("[" + module + "] " + message);
    }

    public void warn(String module, String message) {
        LogActivator.getLogger().warn("[" + module + "] " + message);
    }

    public void info(String module, String message) {
        LogActivator.getLogger().info("[" + module + "] " + message);
    }

    public void debug(String module, String message) {
        LogActivator.getLogger().debug("[" + module + "] " + message);
    }

    public void trace(String module, String message) {
        LogActivator.getLogger().trace("[" + module + "] " + message);
    }
}
