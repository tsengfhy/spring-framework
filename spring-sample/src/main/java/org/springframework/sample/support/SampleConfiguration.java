package org.springframework.sample.support;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(
		excludeFilters = @ComponentScan.Filter(Controller.class)
)
@PropertySources({
		@PropertySource("classpath:application.properties"),
		@PropertySource("classpath:application-${profile}.properties")
})
public class SampleConfiguration {

	@Value("${value}")
	private String value;

	@Bean
	@Conditional(SampleCondition.class)
	public org.springframework.sample.support.Bean bean() {
		return new org.springframework.sample.support.Bean(value);
	}

	@Configuration
	@Conditional(SampleCondition.class)
	public static class UnMatchedConfiguration {}
}
