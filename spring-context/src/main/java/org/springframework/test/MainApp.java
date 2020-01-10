package org.springframework.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.bean.Person;

/**
 * @author 邱凯旋
 * @date 2020/1/10 10:32
 */
public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigrationPerson.class);
		Person person = context.getBean(Person.class);
		System.out.println(person);
	}
}
