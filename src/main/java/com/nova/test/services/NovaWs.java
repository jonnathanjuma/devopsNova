package com.nova.test.services;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.nova.test.model.NovaMS;
import com.nova.test.model.NovaResMS;

/* Servicios Nova */
@CrossOrigin
@RestController
public class NovaWs {

	/* Prueba del servicio */
	@GetMapping("/prueba")
	@ResponseStatus(HttpStatus.OK)
	public String prueba() {
		return String.format("Funciona!");
	}

	/* Servicio recibir parametros */
	@PostMapping("/DevOps")
	@ResponseStatus(HttpStatus.OK)
	public NovaResMS devops(@RequestBody NovaMS nova) {
		NovaResMS respuesta = new NovaResMS();
		respuesta.setMessage("Hello ".concat(nova.getTo().concat(" your message will be send")));
		return respuesta;
	}
}