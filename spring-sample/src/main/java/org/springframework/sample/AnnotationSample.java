package org.springframework.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.sample.support.BeanInterface;
import org.springframework.sample.support.SampleConfiguration;

@Import(SampleConfiguration.class)
public class AnnotationSample {

	public static void main(String[] args) {
		ApplicationContext cxt = new AnnotationConfigApplicationContext(AnnotationSample.class);

		BeanInterface bean = cxt.getBean("bean", BeanInterface.class);
		bean.execute();
	}
}
