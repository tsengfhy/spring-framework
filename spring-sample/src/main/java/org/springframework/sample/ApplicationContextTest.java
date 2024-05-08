package org.springframework.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.sample.support.Bean;

public class ApplicationContextTest {
	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("beans.xml");

		Bean bean = cxt.getBean("bean", Bean.class);
		System.out.println(bean.getValue());
	}
}
