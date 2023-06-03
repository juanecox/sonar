package com.microservicio.sonar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SonarExampleApplicationTests {

	  @Autowired
	   private MyController myController;
	  
	@Test
	public void contextLoads() throws Exception {
		 assertThat(myController).isNotNull();
	}

}
