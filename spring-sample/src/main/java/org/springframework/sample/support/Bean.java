package org.springframework.sample.support;

public class Bean {

	// Constructor Value
	private String value;
	// Autowired Value
	private Bean bean;

	public Bean() {
	}

	public Bean(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Bean getBean() {
		return bean;
	}

	public void setBean(Bean bean) {
		this.bean = bean;
	}
}
