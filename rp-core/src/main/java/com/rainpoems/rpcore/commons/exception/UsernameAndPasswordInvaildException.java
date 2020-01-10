package com.rainpoems.rpcore.commons.exception;

public class UsernameAndPasswordInvaildException extends RuntimeException {

    public UsernameAndPasswordInvaildException() {
        super("账号密码不对");
    }
}
