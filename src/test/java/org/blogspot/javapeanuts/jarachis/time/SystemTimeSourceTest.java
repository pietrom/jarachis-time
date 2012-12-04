package org.blogspot.javapeanuts.jarachis.time;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;

public class SystemTimeSourceTest {
	@Test
	public void returnsCurrentTimeMillisFromSystemCLock() throws Exception {
		final long before = System.currentTimeMillis();
		TimeSource source = new SystemTimeSource();
		final long currentTime = source.currentTimeMillis();
		final long after = System.currentTimeMillis();
		assertBetween(before, after, currentTime);
	}

	@Test
	public void returnsCurrentTimeFromSystemCLock() throws Exception {
		final long before = System.currentTimeMillis();
		TimeSource source = new SystemTimeSource();
		final Date currentTime = source.currentTime();
		final long after = System.currentTimeMillis();
		assertBetween(before, after, currentTime.getTime());
	}

	private static void assertBetween(long before, long after, long current) {
		assertTrue(before <= current);
		assertTrue(current <= after);
	}
}
