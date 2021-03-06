package io.github.chcat.restclientgenerator;

import io.github.chcat.restclientgenerator.http.RequestExecutor;
import io.github.chcat.restclientgenerator.http.security.authentication.AuthenticationStrategy;

/**
 * Created by pasa on 19.02.2015.
 */
public class ServiceConfig {

    private final String baseUrl;
    private final RequestExecutor requestExecutor;
    private final AuthenticationStrategy authenticationStrategy;

    public ServiceConfig(String baseUrl, RequestExecutor requestExecutor, AuthenticationStrategy authenticationStrategy) {
        this.baseUrl = baseUrl;
        this.requestExecutor = requestExecutor;
        this.authenticationStrategy = authenticationStrategy;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public RequestExecutor getRequestExecutor() {
        return requestExecutor;
    }

    public AuthenticationStrategy getAuthenticationStrategy() {
        return authenticationStrategy;
    }
}
