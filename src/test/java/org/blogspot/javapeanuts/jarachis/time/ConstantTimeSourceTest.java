package org.blogspot.javapeanuts.jarachis.time;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

public class ConstantTimeSourceTest {
	private static long TIME_IN_MILLIS = 12345L;

	@Test
	public void returnsProvidedTimeMillis() throws Exception {
		final TimeSource source = new ConstantTimeSource(TIME_IN_MILLIS);
		assertEquals(TIME_IN_MILLIS, source.currentTimeMillis());
	}
	
	@Test
	public void returnsDateBasedUponProvidedTimeMillis() throws Exception {
		final TimeSource source = new ConstantTimeSource(TIME_IN_MILLIS);
		final Date currentTime = source.currentTime();
		assertEquals(TIME_IN_MILLIS, currentTime.getTime());
	}
}
