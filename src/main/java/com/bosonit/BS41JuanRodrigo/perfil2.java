package com.bosonit.BS41JuanRodrigo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("perfil2")
public class perfil2 implements perfiles {

    @Override
    public String miFuncion2(valor2 valor2URL, valor2 valor2Password) {
        return "el valor2 URL del perfil2 es: " + valor2URL.getUrl2() + " y el password es: " + valor2Password.getPassword2();
    }

    @Override
    public String miFuncion1(valor1 valor1URL, valor1 valor1Password) {
        return null;
    }

}
