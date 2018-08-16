package net.kalytta.osgi.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import java.util.Hashtable;

public class LogActivator implements BundleActivator {

    private static final Logger logger = LogManager.getLogger("kalytta.net OSGi Logging Module");

    private ServiceRegistration loggingServiceRegistration;

    public void start(BundleContext bundleContext) throws Exception {

        logger.trace("[Logging] Invoked startup of logging module");
        //Eigenen Service definieren und registrieren
        Hashtable<String, String> properties = new Hashtable<String, String>();
        properties.put("version", "1.0");
        logger.trace("[Logging] Service properties created");
        LoggingService loggingService = new LoggingService();
        loggingServiceRegistration = bundleContext.registerService(LoggingInterface.class.getName(), loggingService, properties);
        loggingService.trace("Logging", "Service added to service registration");

        logger.info("[Logging] started.");

    }

    public void stop(BundleContext bundleContext) throws Exception {

        logger.info("[Logging] stopped.");

    }

    public static Logger getLogger() {
        return logger;
    }
}
