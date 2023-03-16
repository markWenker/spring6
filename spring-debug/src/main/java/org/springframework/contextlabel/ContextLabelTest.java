package org.springframework.contextlabel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 解析context标签
 *
 * @author wangmingxing
 */
public class ContextLabelTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("contextlabel/contextLabel.xml");
		String[] beanDefinitionNames = ac.getBeanDefinitionNames();
		System.out.println(beanDefinitionNames);
	}
}
