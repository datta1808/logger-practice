package com.bridgelabz.logger;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;

/**
 * Hello world!
 *
 */
public class App 
{
	static Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args ) throws IOException
    {
    	// here Appender is an interface
//		Layout layout = new SimpleLayout();
//		Layout layout = new HTMLLayout();
		Layout layout = new PatternLayout("%d %p %C %M %m %n"); //date, Class, Method, message, newline
//		Appender appender = new ConsoleAppender(layout); // appender is used for destination ex. Console using consoleAppender
		Appender appender = new FileAppender(layout, "Applog.log");
		logger.addAppender(appender); // to add appender to the logger
		logger.debug("debug message");
		logger.info("info message");
		logger.warn("warn message");
		logger.error("error message");
		logger.fatal("fatal message");
    }
}
