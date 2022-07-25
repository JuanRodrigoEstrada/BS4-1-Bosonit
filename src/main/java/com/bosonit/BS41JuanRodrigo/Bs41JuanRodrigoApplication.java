package com.bosonit.BS41JuanRodrigo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Bs41JuanRodrigoApplication {


	public static void main(String[] args) {
		SpringApplication.run(Bs41JuanRodrigoApplication.class, args);
	}
@Bean
	valor1 valor1Bean() {
		valor1 valor1 = new valor1();
		return valor1;
};
	@Bean
	valor2 getValor2Bean(){
		valor2 valor2 = new valor2();
		return valor2;
	}

	@Bean
	variables getVarialesBean(){
		variables variables = new variables();
		return variables;
	}
}
