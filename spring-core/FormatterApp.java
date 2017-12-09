package com.baeldung;

public class FormatterApp {

	private IFormatter formatter;
	
	public FormatterApp(IFormatter formatter){
		this.formatter = formatter;
	}
	
	public void printFormattedMessage(String msg){
		System.out.println(formatter.format(msg));
	}

}
