package com.blogspot.javapeanuts.jarachis.time;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.Test;

public class ConstantTimeSourceTest {
	// START SNIPPET: declare-long
	private static final long TIME_IN_MILLIS = 12345L;
	// END SNIPPET: declare-long

	@Test
	public void returnsProvidedTimeMillis() throws Exception {
		// START SNIPPET: init-by-long
		final TimeSource source = new ConstantTimeSource(TIME_IN_MILLIS);
		// END SNIPPET: init-by-long
		// START SNIPPET: current-time-millis
		assertEquals(TIME_IN_MILLIS, source.currentTimeMillis());
		// END SNIPPET: current-time-millis
	}

	@Test
	public void returnsDateBasedUponProvidedTimeMillis() throws Exception {
		final TimeSource source = new ConstantTimeSource(TIME_IN_MILLIS);
		// START SNIPPET: current-time
		final Date currentTime = source.currentTime();
		assertEquals(TIME_IN_MILLIS, currentTime.getTime());
		// END SNIPPET: current-time
	}

	@Test
	public void canBeInitializedProvidingConstantDate() throws Exception {
		// START SNIPPET: init-by-date
		final Date aDate = new Date();
		final TimeSource source = new ConstantTimeSource(aDate);
		// END SNIPPET: init-by-date
		assertEquals(aDate, source.currentTime());
	}
}
