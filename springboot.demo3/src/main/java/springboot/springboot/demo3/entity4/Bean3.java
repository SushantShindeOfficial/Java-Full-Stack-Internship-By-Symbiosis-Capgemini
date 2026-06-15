 package springboot.springboot.demo3.entity4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(Bean2.class)
@Configuration
public class Bean3 {
	@Bean
	public Dept dept() {
		return new Dept();
	}

	@Bean
	public Ceo ceo() {
		return new Ceo();
	}

	@Bean
	public Org org() {
		return new Org();
	}

}
