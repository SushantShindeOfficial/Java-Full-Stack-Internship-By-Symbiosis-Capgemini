package spring.web.app.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
@Service
public class KafkaProducer {
	public	Logger logger=LoggerFactory.getLogger(KafkaProducer.class);
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	public void sendData(String messgae)
	{
		logger.info("msg sent",messgae);
		kafkaTemplate.send(Beanclass.topic,messgae);
	}
}
