package springboot.springboot.demo3.entity4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
@Import(Bean1.class)
@Configuration
public class Bean2 {
	@Bean
	public 	Employee emp() {
		return new Employee();
	}
}
