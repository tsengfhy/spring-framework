package org.springframework.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.sample.support.Bean;
import org.springframework.sample.support.BeanService;

public class TXSample {
	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("tx.xml");

		BeanService beanService = cxt.getBean("beanService", BeanService.class);
		String id = "test";
		Bean bean = new Bean(id);
		beanService.save(bean);
		beanService.get(id).execute();
	}
}
