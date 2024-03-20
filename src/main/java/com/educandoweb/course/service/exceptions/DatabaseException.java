package com.educandoweb.course.service.exceptions;

import org.hibernate.dialect.Database;

import javax.xml.crypto.Data;

public class DatabaseException extends RuntimeException{
    public DatabaseException(String msg) {
        super(msg);
    }
}
