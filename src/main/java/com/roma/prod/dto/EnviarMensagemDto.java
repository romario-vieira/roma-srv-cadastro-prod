package com.roma.prod.dto;

import java.util.Map;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EnviarMensagemDto {

	@Schema(description = "Mensagem que será enviada para o tópico Kafka", example = "{\"mensagem\": {\"nome\": \"Romario\",\"idade\": \"Quase 32\"}}")
	private Map<String, Object> mensagem;
}
