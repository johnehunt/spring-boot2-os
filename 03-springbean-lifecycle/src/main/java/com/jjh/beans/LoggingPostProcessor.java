package com.jjh.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class LoggingPostProcessor implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("LoggingPostProcessor - postProcessBeforeInitialization bean: " + beanName);
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("LoggingPostProcessor - postProcessAfterInitialization bean: " + beanName);
		return bean;
	}

}
