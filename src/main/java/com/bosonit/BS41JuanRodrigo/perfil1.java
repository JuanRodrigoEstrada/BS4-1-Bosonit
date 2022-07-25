package com.bosonit.BS41JuanRodrigo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("perfil1")
public class perfil1 implements perfiles {


    @Override
    public String miFuncion1(valor1 valor1URL, valor1 valor1Password) {
        return "el valor1 URL del perfil1 es: " + valor1URL.getUrl1() + " y el password es: " + valor1Password.getPassword1();
    }

    @Override
    public String miFuncion2(valor2 valorURL2, valor2 valor2Password) {
        return null;
    }


}
