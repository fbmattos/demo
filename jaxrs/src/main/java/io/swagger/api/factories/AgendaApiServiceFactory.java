package io.swagger.api.factories;

import io.swagger.api.AgendaApiService;
import io.swagger.api.impl.AgendaApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-04-18T13:01:55.825Z")
public class AgendaApiServiceFactory {
    private final static AgendaApiService service = new AgendaApiServiceImpl();

    public static AgendaApiService getAgendaApi() {
        return service;
    }
}
