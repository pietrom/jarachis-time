package org.blogspot.javapeanuts.jarachis.time;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConstantTimeSourceTest {
	@Test
	public void returnsProvidedTimeMillis() throws Exception {
		final long timeInMillis = 12345L;
		final TimeSource source = new ConstantTimeSource(timeInMillis);
		assertEquals(timeInMillis, source.currentTimeMillis());
	}
}
