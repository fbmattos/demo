package io.swagger.api.factories;

import io.swagger.api.AgendaApiService;
import io.swagger.api.impl.AgendaApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-05-02T19:22:37.712Z")
public class AgendaApiServiceFactory {
    private final static AgendaApiService service = new AgendaApiServiceImpl();

    public static AgendaApiService getAgendaApi() {
        return service;
    }
}
