package org.springframework.selftag;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wangmingxing
 */
public class SelfTagTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("xml/selftag/selfTag.xml");
		User wmx = (User) ac.getBean("wmx");
		System.out.println(wmx);
	}
}
