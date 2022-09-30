package com.example.springsecurityex;

import com.example.springsecurityex.repository.CandidatoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringSecurityExApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	CandidatoRepository candidatoRepository;

	@Test
	void testLoginPositive(){

	}

}
