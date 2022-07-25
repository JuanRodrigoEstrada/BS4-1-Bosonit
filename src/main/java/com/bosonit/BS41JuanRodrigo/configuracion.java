package com.bosonit.BS41JuanRodrigo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;

@Configuration
@PropertySource("classpath:miconfiguracion.properties")
public class configuracion {

@Autowired
    valor1 valor1;
@Autowired
    valor2 valor2;

@PostConstruct
    public void ClaseImpl(){

    System.out.println(valor1.toString());
    System.out.println(valor2.toString());
}


}
