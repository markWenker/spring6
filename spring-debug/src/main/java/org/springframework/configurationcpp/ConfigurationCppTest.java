package org.springframework.configurationcpp;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.entity.Person;

/**
 * debug ConfigurationClassPostProcessors执行过程，注解解析过程
 *
 * @author wangmingxing
 */
public class ConfigurationCppTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("xml/configurationcpp/configurationcpp.xml");
		Person person = (Person) ac.getBean("person");
		System.out.println("name type: " + person);
		Person bean = ac.getBean(Person.class);
		System.out.println("class type: " + bean);
	}
}
