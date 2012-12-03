package org.blogspot.javapeanuts.jarachis.time;

import java.util.Date;

public class ConstantTimeSource implements TimeSource {
	private final long timeMillis;
	private final Date time;
	
	public ConstantTimeSource(long timeMillis) {
		this.timeMillis = timeMillis;
		this.time = new Date(timeMillis);
	}

	public ConstantTimeSource(Date aDate) {
		this.time = aDate;
		this.timeMillis = aDate.getTime();
	}

	@Override
	public long currentTimeMillis() {
		return timeMillis;
	}

	@Override
	public Date currentTime() {
		return time;
	}
}
