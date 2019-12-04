package com.ustglobal.spring_core.di;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcesser  implements BeanPostProcessor {


	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("interface method 1 postProcessBeforeInitialization  : " + beanName);
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("interface method 2 postProcessAfterInitialization : " + beanName);
		return bean;
	}

}
