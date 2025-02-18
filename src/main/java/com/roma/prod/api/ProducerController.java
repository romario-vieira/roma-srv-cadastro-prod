package com.roma.prod.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.roma.prod.dto.EnviarMensagemDto;
import com.roma.prod.producer.MessageProducer;

@RestController
@RequestMapping(path = "/producer/api/v1")
public class ProducerController {
	
	@Autowired
	private MessageProducer producer;

	@PostMapping(path = "/enviar")
	public ResponseEntity<String> enviarMensagem(@RequestBody EnviarMensagemDto request) throws JsonProcessingException {
		String response = producer.publicaTopico(request.getMensagem());
		
		return ResponseEntity.ok(response);
	}
}
