package org.springframework.cutomercontext;

import org.springframework.entity.Person;

/**
 * @author mingxing.wang
 */
public class CustomTest {
	public static void main(String[] args) {
		CustomXmlApplicationContext ac = new CustomXmlApplicationContext("xml/xmlLoad/xmlLoad.xml");
		Person person = (Person) ac.getBean("person");
		System.out.println("name type: " + person);
		Person bean = ac.getBean(Person.class);
		System.out.println("class type: " + bean);

	}
}
