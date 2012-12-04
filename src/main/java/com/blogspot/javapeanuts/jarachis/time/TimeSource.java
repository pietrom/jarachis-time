package com.blogspot.javapeanuts.jarachis.time;

import java.util.Date;
/**
 * This interface represents an abstraction whose purpose is decoupling time providing strategy from time clients.
 * @author Pietro Martinelli
 */
public interface TimeSource {
	/**
	 * Provides access to current time represented as a <code>long</code> value.
	 * @return Current time in millis, since 1 Jan 1970
	 */
	public abstract long currentTimeMillis();
	/**
	 * Provides access to current time represented as a {@link java.util.Date} instance.
	 * @return A {@link java.util.Date} instance representing current time.
	 */
	public abstract Date currentTime();
}
