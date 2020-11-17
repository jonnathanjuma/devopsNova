package com.nova.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.nova.test.model.NovaMS;
import com.nova.test.model.NovaResMS;

@SpringBootTest
class TestApplicationTests {
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}

	/* Prueba del servicio Nova Ms */
	@Test
	public void testNovaWs() throws Exception {
		NovaMS datos = new NovaMS();
		datos.setMessage("Prueba");
		datos.setFrom("Jonnathan");
		datos.setTimeToLifeSec("10");
		datos.setTo("Juan");
		assertThat(this.restTemplate().postForObject("http://localhost:8080/DevOps", datos,
				NovaResMS.class));
	}

}
