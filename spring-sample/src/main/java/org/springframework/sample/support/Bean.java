package org.springframework.sample.support;

public class Bean implements BeanInterface {

	// Constructor Value
	private final String value;
	// Autowired Value
	private Bean bean;

	public Bean(String value) {
		this.value = value;
	}

	@Override
	public void execute() {
		System.out.println(value);
	}

	public String getValue() {
		return value;
	}

	public Bean getBean() {
		return bean;
	}

	public void setBean(Bean bean) {
		this.bean = bean;
	}
}
