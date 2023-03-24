package org.springframework.selfbdrpp;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.entity.Person;

/**
 * debug invokeBeanFactoryPostProcessors执行过程，在此过程中添加新的processor
 *
 * @author wangmingxing
 */
public class SelfBdrppTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("xml/bdrpp/bdrpp.xml");
		Person person = (Person) ac.getBean("person");
		System.out.println("name type: " + person);
		Person bean = ac.getBean(Person.class);
		System.out.println("class type: " + bean);
	}
}
