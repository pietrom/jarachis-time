package com.blogspot.javapeanuts.jarachis.time;

import java.util.Date;

public class ConstantTimeSource implements TimeSource {
	private final long timeMillis;

	public ConstantTimeSource(long timeMillis) {
		this.timeMillis = timeMillis;
	}

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
