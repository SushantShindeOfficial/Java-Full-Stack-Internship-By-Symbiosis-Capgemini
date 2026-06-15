package springboot.springboot.demo3.entity3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Bean1 {
	@Bean
	@Scope("singleton")
	public Student abc() {
		return new Student();
	}
}
