package com.miniapps.atm;

public class ClientNotFoundException extends RuntimeException {
    Integer account;

    public ClientNotFoundException(Integer account) {
        this.account = account;
    }

    @Override
    public String getMessage() {
        return String.format("\nClient %1s was not found", account);
    }
}
