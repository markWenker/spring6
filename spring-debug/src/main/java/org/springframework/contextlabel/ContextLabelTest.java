package org.springframework.contextlabel;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * 解析context标签
 *
 * @author wangmingxing
 */
public class ContextLabelTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("xml/contextlabel/contextLabel.xml");
		DriverManagerDataSource dataSource = (DriverManagerDataSource) ac.getBean("dataSource");
		System.out.println(dataSource.getUsername());
		System.out.println(dataSource.getPassword());
	}
}
