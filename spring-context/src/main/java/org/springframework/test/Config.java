package org.springframework.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.bean.Person;

/**
 * @author 邱凯旋
 * @date 2020/1/10 10:35
 */
@Configuration
class ConfigrationPerson {
	@Bean("person")
	public Person getPerson() {
		return new Person("kaire", 24);
	}
}
