package com.blogspot.javapeanuts.jarachis.time;

import java.util.Date;
/**
 * {@link TimeSource} implementation which returns an element of initially provided sequence of values at every <tt>currentTime[Millis]</tt> invocation.
 * @author Pietro Martinelli
 *
 */
public class SequentialTimeSource implements TimeSource {
	/**
	 * Fixed current time sequence provided from client and returned by
	 * {@link SequentialTimeSource} instance.
	 */
	private final long[] timeMillis;

	/**
	 * Index of time in time sequence returned by next invokation of
	 * <tt>currentTime[Millis]</tt>.
	 */
	private int current = 0;

	/**
	 * @param dates Fixed time sequence provided as {@link java.util.Date} vararg
	 */
	public SequentialTimeSource(Date... dates) {
		timeMillis = new long[dates.length];
		for (int i = 0; i < timeMillis.length; i++) {
			timeMillis[i] = dates[i].getTime();
		}
	}

	/**
	 * @param timeMillis Fixed time sequence provided as <tt>long</tt> vararg
	 */
	public SequentialTimeSource(long... timeMillis) {
		this.timeMillis = timeMillis;
	}

	@Override
	public final long currentTimeMillis() {
		return getCurrentAndIncrement();
	}

	@Override
	public final Date currentTime() {
		return new Date(getCurrentAndIncrement());
	}

	private long getCurrentAndIncrement() {
		long result = timeMillis[current];
		current++;
		return result;
	}
}
