package com.baeldung;

public class HtmlFormatter implements IFormatter {

	public String format(String str2Format) {
		return "<b>" + str2Format + "</b>";
	}

}
