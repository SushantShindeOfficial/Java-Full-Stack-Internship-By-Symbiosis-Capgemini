package spring.web.app.project;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class KafkaConsumer {
	public Logger logger=LoggerFactory.getLogger(KafkaConsumer.class);
	@KafkaListener(topics = Beanclass.topic,groupId = Beanclass.id)
	public  void consumer(String message)
	{
		logger.info(message);
	}
}
