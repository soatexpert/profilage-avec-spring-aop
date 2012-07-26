package com.soat.spring.aop.demo.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.soat.spring.aop.demo.Metier;

public class ProfilingMetierTestCase {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		int rec;
		Metier t1 = (Metier) context.getBean("classMetier");
		rec = t1.jeTravaille();
		assertEquals(21, rec);
		
		
	}

}
