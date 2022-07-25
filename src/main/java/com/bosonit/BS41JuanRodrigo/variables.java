package com.bosonit.BS41JuanRodrigo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class variables {
    private String url;
    private String pasword;

    public variables(String url, String pasword) {
        this.url = url;
        this.pasword = pasword;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }



    @Override
    public String toString() {
        return "variables{" +
                "url='" + url + '\'' +
                ", pasword='" + pasword + '\'' +
                '}';
    }
}

