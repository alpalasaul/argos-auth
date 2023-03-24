package com.krypton.helmetauth.exceptions;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class BlogAppException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private HttpStatus status;
    private String mensaje;

    public BlogAppException(HttpStatus status, String mensaje) {
        super(mensaje);
        this.status = status;
        this.mensaje = mensaje;
    }

}