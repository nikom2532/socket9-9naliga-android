/*
 * 
 */
package com.socket9.ninenaliga.android.library;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating Log objects.
 */
public class LogFactory {
	
	/**
	 * Gets the log.
	 *
	 * @param clazz the clazz
	 * @return log
	 */
	public static LogManager getLog(Class clazz)
	{
		LogManager log = new LogManager();
		log.setClassName(clazz.getName());
		return log;
	}

	/**
	 * Gets the log.
	 *
	 * @param name the name
	 * @return log
	 */
	public static LogManager getLog(java.lang.String name)
	{
		LogManager log = new LogManager();
		log.setClassName(name);
		return log;
	}
}
