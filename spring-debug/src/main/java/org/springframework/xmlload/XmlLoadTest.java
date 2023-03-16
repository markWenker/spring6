package org.springframework.xmlload;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.entity.Person;

/**
 * debug spring启动以及加载简单xml和简单bean过程
 *
 * @author wangmingxing
 */
public class XmlLoadTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("xml/xmlLoad/xmlLoad.xml");
		Person person = (Person) ac.getBean("person");
		System.out.println("name type: " + person);
		Person bean = ac.getBean(Person.class);
		System.out.println("class type: " + bean);
	}
}
