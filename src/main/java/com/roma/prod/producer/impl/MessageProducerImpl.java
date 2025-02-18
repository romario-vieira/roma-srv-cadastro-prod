package com.roma.prod.producer.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.roma.prod.producer.MessageProducer;

@Service
public class MessageProducerImpl implements MessageProducer {

	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;
	
	@Autowired
	private ObjectMapper mapper;

	@Override
	public String publicaTopico(Map<String, Object> mensagem) throws JsonProcessingException {

		final String mensagemTopico = mapper.writeValueAsString(mensagem);
		kafkaTemplate.send("roma-topico", mensagemTopico);

		return "Mensagem publicada com sucesso";
	}

}
