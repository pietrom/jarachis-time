package org.blogspot.javapeanuts.jarachis.time;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class ConstantTimeSourceTest {
	private static final long TIME_IN_MILLIS = 12345L;

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

	@Test
	public void canBeInitializedProvidingConstantDate() throws Exception {
		final Date aDate = new Date();
		final TimeSource source = new ConstantTimeSource(aDate);
		assertEquals(aDate, source.currentTime());
	}
}
