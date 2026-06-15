package spring.web.app.project;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopic {
	@Bean
	public NewTopic abc() {
		return TopicBuilder.name("test").build();
	}
}

