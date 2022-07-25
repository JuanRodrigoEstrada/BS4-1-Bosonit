package com.bosonit.BS41JuanRodrigo;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@Data
@ConfigurationProperties(prefix = "valor1")
@PropertySource("classpath:application.properties")
public class valor1 {
    private String url1;
    private String password1;


    public valor1(String url1, String password1) {
        this.url1 = url1;
        this.password1 = password1;
    }

    public valor1(){

    }

    public String getUrl1() {
        return url1;
    }

    public void setUrl1(String url1) {
        this.url1 = url1;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    @Override
    public String toString() {
        return "valor1{" +
                "url1='" + url1 + '\'' +
                ", password1='" + password1 + '\'' +
                '}';
    }
}
