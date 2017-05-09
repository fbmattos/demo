package io.swagger.api.factories;

import io.swagger.api.AgendaApiService;
import io.swagger.api.impl.AgendaApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-05-09T12:14:58.613Z")
public class AgendaApiServiceFactory {
    private final static AgendaApiService service = new AgendaApiServiceImpl();

    public static AgendaApiService getAgendaApi() {
        return service;
    }
}
