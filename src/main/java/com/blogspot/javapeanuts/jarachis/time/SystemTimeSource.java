package com.blogspot.javapeanuts.jarachis.time;

import java.util.Date;
/**
 * System-time based implementation of {@link TimeSource}.
 * @author pmartinelli
 *
 */
public class SystemTimeSource implements TimeSource {
	@Override
	public final long currentTimeMillis() {
		return System.currentTimeMillis();
	}

	@Override
	public final Date currentTime() {
		return new Date();
	}
}
