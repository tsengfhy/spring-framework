package org.springframework.sample;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.sample.support.BeanInterface;

public class BeanFactorySample {
	public static void main(String[] args) {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions(new ClassPathResource("beans.xml"));

		BeanInterface bean = beanFactory.getBean("bean", BeanInterface.class);
		bean.execute();
	}
}