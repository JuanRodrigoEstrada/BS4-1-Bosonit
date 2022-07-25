package com.bosonit.BS41JuanRodrigo;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@Data
@NoArgsConstructor
@ConfigurationProperties(prefix = "valor2")
@PropertySource("classpath:miconfiguracion.properties")
public class valor2 {
    private String url2;
    private String password2;

    public valor2(String url2, String password2) {
        this.url2 = url2;
        this.password2 = password2;
    }

    public String getUrl2() {
        return url2;
    }

    public void setUrl2(String url2) {
        this.url2 = url2;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    @Override
    public String toString() {
        return "valor2{" +
                "url2='" + url2 + '\'' +
                ", password2='" + password2 + '\'' +
                '}';
    }
}
