package org.designpattern.bridge1;

public class StandardFormatter implements Formatter {

	@Override
	public String format(String key, String value) {
		return String.format("%s: %s", key, value);
	}
}
