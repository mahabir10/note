package com.sibsenap.note.security;

import java.io.IOException;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*
 * This handles the exceptions, 
 * This is because it is happening before it reaches the servlet
 */

@Component
public class JwtAuthEntryPoint implements AuthenticationEntryPoint{

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
            AuthenticationException authException) throws IOException, ServletException {
        // TODO Auto-generated method stub
        
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, authException.getMessage());
        // throw new UnsupportedOperationException("Unimplemented method 'commence'");
    }

}
