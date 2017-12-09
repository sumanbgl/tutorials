package com.baeldung;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {

	@Test
	public void whenGetBeans_returnsBeans() {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("/com/baeldung/beans.xml");
		FormatterApp formatterApp = (FormatterApp)appContext.getBean("formatterApp",FormatterApp.class);
		formatterApp.printFormattedMessage("hello");
		assertNotNull(formatterApp);
	}

}
