package com.blogspot.javapeanuts.jarachis.time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {

	public static Date createDate(int year, int month, int day) {
		Calendar calendar = new GregorianCalendar(year, month, day);
		return calendar.getTime();
	}

	public static Date createDate(int year, int month, int day, int hour, int minuts,
			int seconds, int millis) {
		Calendar cal = new GregorianCalendar(year, month, day, hour, minuts, seconds);
		cal.set(Calendar.MILLISECOND, millis);
		return cal.getTime();
	}

}
