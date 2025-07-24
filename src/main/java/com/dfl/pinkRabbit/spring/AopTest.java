package com.dfl.pinkRabbit.spring;

public class AopTest implements AopTestIn {

    String username;

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getUsername() {
        return username;
    }
}
