package org.springframework.selfbdrpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

/**
 * @author mark.wang
 * @since 2023/3/23
 */
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("执行postProcessBeanFactory---MyBeanDefinitionRegistryPostProcessor");
		BeanDefinition msb = beanFactory.getBeanDefinition("wmx");
		msb.getPropertyValues().getPropertyValue("name").setConvertedValue("lisi");
		System.out.println("===============");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("执行MyBeanDefinitionRegistryPostProcessor");
		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(MySelfBeanDefinitionRegistryPostProcessor.class);
		beanDefinitionBuilder.addPropertyValue("name", "zhangsan");
		registry.registerBeanDefinition("wmx", beanDefinitionBuilder.getBeanDefinition());
	}
}
