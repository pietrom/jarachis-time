package org.blogspot.javapeanuts.jarachis.time;

import java.util.Date;

public interface TimeSource {
	public abstract long currentTimeMillis();

	public abstract Date currentTime();
}
