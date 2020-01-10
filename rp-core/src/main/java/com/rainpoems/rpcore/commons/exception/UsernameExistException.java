package com.rainpoems.rpcore.commons.exception;

public class UsernameExistException extends RuntimeException {

    public UsernameExistException() {
        super("用户名已经存在");
    }
}
