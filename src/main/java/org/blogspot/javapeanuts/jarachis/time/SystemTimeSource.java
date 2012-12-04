package org.blogspot.javapeanuts.jarachis.time;

import java.util.Date;

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
