package org.springframework.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.sample.support.Bean;
import org.springframework.sample.support.SampleService;

public class TXSample {
	public static void main(String[] args) {
		ApplicationContext cxt = new GenericXmlApplicationContext("tx.xml");

		SampleService sampleService = cxt.getBean("sampleService", SampleService.class);
		String id = "test";
		Bean bean = new Bean(id);
		sampleService.save(bean);
		sampleService.get(id).execute();
	}
}
