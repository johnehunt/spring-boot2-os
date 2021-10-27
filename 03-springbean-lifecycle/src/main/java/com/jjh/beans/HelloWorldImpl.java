package com.jjh.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl implements HelloWorld,
		                               BeanNameAware, BeanFactoryAware, BeanClassLoaderAware,
		InitializingBean, ApplicationContextAware, DisposableBean {

	private String prompt = "Hello";
	
	public void init() {
		System.out.println("init()");
	}
	
	public void cleanup() {
		System.out.println("cleanup()");
	}

	// BeanNameAware
	// -----------------------------
	public void setBeanName(String name) throws BeansException {
		System.out.println("BeanNameAware - setBeanName: " + name);
	}

	// BeanFactoryAware
	// -----------------------------
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactoryAware - setBeanFactory: " + beanFactory);
	}

	// ApplicationContextAware
	// -----------------------------
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("ApplicationContextAware - setApplicationContext: " + applicationContext);
	}

	// InitializingBean
	// -----------------------------
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean - afterPropertiesSet()");
	}

	// BeanClassLoaderAware
	// ----------------------------
	public void setBeanClassLoader(ClassLoader classLoader) {
		System.out.println("BeanClassLoaderAware - setBeanClassLoader(" + classLoader + ")");
	}

    // DisposableBean
	// ----------------------------
	public void destroy() throws Exception {
		System.out.println("DisposableBean - destroy()");
	}
	
	public String getMessage(String string) {
		return prompt + " -> " + string;
	}

	public String getPrompt() {
		return prompt;
	}

	public void setPrompt(String prompt) {
		System.out.println("setPrompt(" + prompt + ")");
		this.prompt = prompt;
	}

}
