package com.blogspot.javapeanuts.jarachis.time;

import java.util.Date;

public class SequentialTimeSource implements TimeSource {
	private final long[] timeMillis;
	private int current = 0;

	public SequentialTimeSource(Date... dates) {
		timeMillis = new long[dates.length];
		for (int i = 0; i < timeMillis.length; i++) {
			timeMillis[i] = dates[i].getTime();
		}
	}
	
	public SequentialTimeSource(long ... timeMillis) {
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
