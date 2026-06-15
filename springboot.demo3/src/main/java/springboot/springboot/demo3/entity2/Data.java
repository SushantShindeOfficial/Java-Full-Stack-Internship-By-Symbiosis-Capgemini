package springboot.springboot.demo3.entity2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Data {
	@Bean
	public Student abc() {
		return new Student();
	}
}
