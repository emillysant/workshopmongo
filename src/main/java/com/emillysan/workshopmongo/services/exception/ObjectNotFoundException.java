package com.emillysan.workshopmongo.services.exception;

public class ObjectNotFoundException extends RuntimeException {

        public ObjectNotFoundException(String message) {
            super(message);
        }
}
