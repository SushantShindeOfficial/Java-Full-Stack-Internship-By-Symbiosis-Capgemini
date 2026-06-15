package spring.web.app.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class ProducerController {
	@Autowired
	KafkaProducer kafkaProducer;

	public ProducerController(KafkaProducer kafkaProducer) {
		super();
		this.kafkaProducer = kafkaProducer;
	}
	@GetMapping("/getData/{message}")
	public ResponseEntity<String> publishService(@PathVariable String message)
	{
		kafkaProducer.sendData(message);
		return ResponseEntity.ok("msg send to Topic");
		
		
	}
	

}

