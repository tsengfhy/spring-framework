package org.springframework.sample.support;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

public class BeanService {

	private JdbcTemplate jdbcTemplate;

	@Transactional
	public void save(Bean bean) {
		jdbcTemplate.update("insert into bean values(?)", bean.getValue());
	}

	public Bean get(String value) {
		return jdbcTemplate.queryForObject("select * from bean where id=?", Bean.class, value);
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
