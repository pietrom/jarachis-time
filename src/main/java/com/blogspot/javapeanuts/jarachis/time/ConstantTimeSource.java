package com.blogspot.javapeanuts.jarachis.time;

import java.util.Date;
/**
 * {@link TimeSource} implementation which returns a fixed current time.
 * @author Pietro Martinelli
 */
public class ConstantTimeSource implements TimeSource {
	/**
	 * Fixed current time provided from client and returned by {@link ConstantTimeSource} instance.
	 */
	private final long timeMillis;
	/**
	 * @param timeMillis Fixed current time represented as a <code>long</code> value, which represents the number of millis since 1 Jan 1970
	 */
	public ConstantTimeSource(long timeMillis) {
		this.timeMillis = timeMillis;
	}
	/**
	 * @param aDate Fixed current time provided as {@link java.util.Date} instance.
	 */
	public ConstantTimeSource(Date aDate) {
		this.timeMillis = aDate.getTime();
	}

	@Override
	public final long currentTimeMillis() {
		return timeMillis;
	}

	@Override
	public final Date currentTime() {
		return new Date(timeMillis);
	}
}
