package ru.kvaga.jmeter.utils.text;

import org.apache.commons.lang3.StringEscapeUtils;

public class UnicodeEscape {

	public String unescapeJSON(String escapedJSON) {
		return StringEscapeUtils.unescapeJson(escapedJSON);
	}
	public static void main(String args[]) {
		// TODO Auto-generated method stub

	}
}