package org.blogspot.javapeanuts.jarachis.time;

import java.util.Date;

public class SystemTimeSource implements TimeSource {
	@Override
	public long currentTimeMillis() {
		return System.currentTimeMillis();
	}

	@Override
	public Date currentTime() {
		return new Date();
	}
}
