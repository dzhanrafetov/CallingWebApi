package com.example.web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.DefaultResponseErrorHandler;


import java.io.IOException;
@Component
public class RestTemplateErrorHandler extends DefaultResponseErrorHandler {

    @Override
    public boolean hasError(ClientHttpResponse response) throws IOException {
        return super.hasError(response);
    }

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
        HttpStatus statusCode = (HttpStatus) response.getStatusCode();

        if (statusCode.series() == HttpStatus.Series.CLIENT_ERROR) {
            if (statusCode == HttpStatus.NOT_FOUND) {
                throw new SymbolNotFoundException(response.getStatusText());
            }
            // Handle other client errors
        } else if (statusCode.series() == HttpStatus.Series.SERVER_ERROR) {
            // Handle server errors
        }

        // Default error handling if no specific condition is met
        super.handleError(response);
    }
}

