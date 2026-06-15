package springboot.springboot.demo3.entity3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Bean2 {
	@Bean
	@Scope("prototype")
		public Student pqr() {
		return new Student();
	}
}
