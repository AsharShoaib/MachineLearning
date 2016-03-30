package model;

import org.jsefa.common.converter.SimpleTypeConverter;

public class DoubleConverter implements SimpleTypeConverter {

	private static final DoubleConverter INSTANCE = new DoubleConverter();

	public static DoubleConverter create() {
		return INSTANCE;
	}

	private DoubleConverter() {
	}

	@Override
	public Object fromString(String s) {
		return new Double(s);
	}

	@Override
	public String toString(Object d) {
		return d.toString();
	}

}