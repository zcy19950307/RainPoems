package com.rainpoems.rpcore.commons.exception;

public class EmailExistException extends RuntimeException {

    public EmailExistException() {
        super("邮箱已经存在");
    }
}
