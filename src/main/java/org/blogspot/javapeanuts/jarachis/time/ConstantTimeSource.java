package org.blogspot.javapeanuts.jarachis.time;

public class ConstantTimeSource implements TimeSource {
	private final long timeMillis;
	
	public ConstantTimeSource(long timeMillis) {
		this.timeMillis = timeMillis;
	}

	@Override
	public long currentTimeMillis() {
		return timeMillis;
	}
}
