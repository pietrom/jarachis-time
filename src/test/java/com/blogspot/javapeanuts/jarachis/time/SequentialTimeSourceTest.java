package com.blogspot.javapeanuts.jarachis.time;

import java.util.Date;

import org.junit.Test;
import static org.junit.Assert.*;

public class SequentialTimeSourceTest {
	private static final long T0 = 0;
	private static final long T1 = 10;
	private static final long T2 = 100;
	
	private static final Date D0 = new Date(T0);
	private static final Date D1 = new Date(T1);
	private static final Date D2 = new Date(T2);
	@Test
	public void currentTimeReturnsProvidedDateTimesInSequence() {
		TimeSource source = new SequentialTimeSource(D0, D1, D2);
		assertEquals(D0, source.currentTime());
		assertEquals(D1, source.currentTime());
		assertEquals(D2, source.currentTime());
	}
	
	public void currentTimeMillisReturnsProvidedDateTimesInSequence() {
		TimeSource source = new SequentialTimeSource(D0, D1, D2);
		assertEquals(T0, source.currentTimeMillis());
		assertEquals(T1, source.currentTimeMillis());
		assertEquals(T2, source.currentTimeMillis());
	}
	
	public void currentTimeMillisReturnsProvidedTimesInSequence() {
		TimeSource source = new SequentialTimeSource(T0, T1, T2);
		assertEquals(T0, source.currentTimeMillis());
		assertEquals(T1, source.currentTimeMillis());
		assertEquals(T2, source.currentTimeMillis());
	}
	
	public void currentTimeReturnsProvidedTimesInSequence() {
		TimeSource source = new SequentialTimeSource(T0, T1, T2);
		assertEquals(D0, source.currentTime());
		assertEquals(D1, source.currentTime());
		assertEquals(D2, source.currentTime());
	}
}
