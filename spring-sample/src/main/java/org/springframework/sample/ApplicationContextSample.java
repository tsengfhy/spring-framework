package org.springframework.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.sample.support.BeanInterface;

public class ApplicationContextSample {
	public static void main(String[] args) {
		ApplicationContext cxt = new GenericXmlApplicationContext("beans.xml");

		BeanInterface bean = cxt.getBean("bean", BeanInterface.class);
		bean.execute();
	}
}
