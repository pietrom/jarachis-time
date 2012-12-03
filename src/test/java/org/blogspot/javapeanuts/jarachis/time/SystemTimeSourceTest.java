package org.blogspot.javapeanuts.jarachis.time;

import static org.junit.Assert.*;

import org.junit.Test;

public class SystemTimeSourceTest {
	@Test
	public void returnsCurrentTimeFromSystemCLock() throws Exception {
		final long before = System.currentTimeMillis();
		TimeSource source = new SystemTimeSource();
		final long currentTime = source.currentTimeMillis();
		final long after = System.currentTimeMillis();
		assertTrue(before <= currentTime);
		assertTrue(currentTime <= after);
	}
}
