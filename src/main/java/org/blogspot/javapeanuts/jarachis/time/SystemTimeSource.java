package org.blogspot.javapeanuts.jarachis.time;

public class SystemTimeSource implements TimeSource {
	@Override
	public long currentTimeMillis() {
		return System.currentTimeMillis();
	}
}
