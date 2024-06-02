package com.springframework.demo.project.xmlbasedconf;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;


//@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class XmlJdbcConnection {

	public XmlJdbcConnection() {
		System.out.println("JBBC Connection");
	}
}
