package org.springframework.selfbdrpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author mark.wang
 * @since 2023/3/25
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition person = beanFactory.getBeanDefinition("person");
		//此处可以对对应的BeanDefinition进行相关设置修改操作
		person.setLazyInit(false);
		System.out.println("自定义的BeanFactoryPostProcessor");
	}
}
