package com.bosonit.BS41JuanRodrigo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controlador {
    @Autowired
    perfiles perfiles;
    @Autowired
    valor1 valor1;
    @Autowired
    valor2 valor2;
    @Autowired
    variables variables;

    @GetMapping("/parametros")
    String getParametros(){

        return "el valor de url es : " + variables.getUrl() + " y el valor del password es: " + variables.getPasword();

    }

    @GetMapping("/miconfiguracion")
    String getValores(){
        return "Valor de valor 1: " + valor1.toString() + "\nValor de valor2: " + valor2.toString();
    }

    @GetMapping("/perfil")
    String getPerfiles(){

        return perfiles.miFuncion2(valor2, valor2);
    }





}
