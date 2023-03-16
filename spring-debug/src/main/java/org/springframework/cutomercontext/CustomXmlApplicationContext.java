package org.springframework.cutomercontext;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author mingxing.wang
 */
public class CustomXmlApplicationContext extends ClassPathXmlApplicationContext {
	public CustomXmlApplicationContext(String... configLocations) {
		super(configLocations);
	}

	@Override
	protected void initPropertySources() {
		System.out.println("拓展initPropertySources");
		getEnvironment().setRequiredProperties("username");
	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
//		super.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
		super.customizeBeanFactory(beanFactory);
	}

	@Override
	protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
		System.out.println("拓展postProcessBeanFactory");
	}
}
