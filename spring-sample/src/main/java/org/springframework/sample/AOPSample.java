package org.springframework.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.sample.support.BeanInterface;

public class AOPSample {
	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("aop.xml");

		BeanInterface bean = cxt.getBean("bean", BeanInterface.class);
		bean.execute();
	}
}
