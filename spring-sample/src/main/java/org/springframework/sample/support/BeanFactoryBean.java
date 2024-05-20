package org.springframework.sample.support;

import org.springframework.beans.factory.FactoryBean;

public class BeanFactoryBean implements FactoryBean<Bean> {

	private String value;

	@Override
	public Bean getObject() throws Exception {
		Bean bean = new Bean(value);
		return bean;
	}

	@Override
	public Class<?> getObjectType() {
		return Bean.class;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
