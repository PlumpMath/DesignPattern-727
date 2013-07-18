package org.designpattern.bridge1;

public class BackwardFormatter implements Formatter {

	@Override
	public String format(String key, String value) {
		return String.format("%s: %s", key, new StringBuilder(value)
				.reverse().toString());
	}

}
