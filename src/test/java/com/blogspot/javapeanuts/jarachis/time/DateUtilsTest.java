package com.blogspot.javapeanuts.jarachis.time;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilsTest {
	private static final int YEAR = 1978;
	private static final int MONTH = Calendar.MARCH;
	private static final int DAY = 19;
	private static final DateFormat DATE_FORMATTER = new SimpleDateFormat("dd/MM/yyyy");
	private static final DateFormat DATETIME_FORMATTER = new SimpleDateFormat("dd-MM-yy HH:mm:ss S");
	private static final DateFormat DATETIME_NO_MS_FORMATTER = new SimpleDateFormat("dd-MM-yy HH:mm:ss");

	@Test
	public void createDateGivenYearMonthAndDay() throws Exception {
		Date date = DateUtils.createDate(YEAR, MONTH, DAY);
		assertEquals("19/03/1978", DATE_FORMATTER.format(date));
	}
	
	@Test
	public void createDateGivenYearMonthDayhourMinutsSecondAndMillis() throws Exception {
		Date date = DateUtils.createDate(YEAR, MONTH, DAY, 1, 2, 3, 4);
		assertEquals("19-03-78 01:02:03 4", DATETIME_FORMATTER.format(date));
	}
	
	@Test
	public void createDateGivenYearMonthDayhourMinutsAndSecond() throws Exception {
		Date date = DateUtils.createDate(YEAR, MONTH, DAY, 1, 2, 3);
		assertEquals("19-03-78 01:02:03", DATETIME_NO_MS_FORMATTER.format(date));
	}
}
