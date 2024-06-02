package com.springframework.project.component;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ComponentPersonDao {
	@Autowired
	ComponentJdbcConnection jdbcconnection;

	public ComponentJdbcConnection getJdbcconnection() {
		return jdbcconnection;
	}

	public void setJdbcconnection(ComponentJdbcConnection jdbcconnection) {
		this.jdbcconnection = jdbcconnection;
	}

}
