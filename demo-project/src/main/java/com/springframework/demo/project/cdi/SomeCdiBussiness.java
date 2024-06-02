package com.springframework.demo.project.cdi;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Named
public class SomeCdiBussiness {
	@Inject
	SomeCdiDAO somecdDao;
	
	

	public SomeCdiDAO getSomecdDao() {
		return somecdDao;
	}

	public void setSomecdDao(SomeCdiDAO somecdDao) {
		this.somecdDao = somecdDao;
	}

}
