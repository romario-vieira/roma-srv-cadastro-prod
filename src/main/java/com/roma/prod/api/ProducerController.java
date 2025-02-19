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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(path = "/producer/api/v1")
@Tag(name = "Producer API", description = "API para enviar mensagens para o tópico kafka")
public class ProducerController {
	
	@Autowired
	private MessageProducer producer;

	@PostMapping(path = "/enviar")
	@Operation(summary = "Endpoint para enviar mensagem para o tópico kafka", description = "Envia uma mensagem para o tópico kafka especificado")
	public ResponseEntity<String> enviarMensagem(@RequestBody EnviarMensagemDto request) throws JsonProcessingException {
		String response = producer.publicaTopico(request.getMensagem());

		return ResponseEntity.ok(response);
	}
}
