package com.roma.prod.producer;

import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface MessageProducer {
	String publicaTopico(Map<String, Object> mensagem) throws JsonProcessingException;
}
