package io.swagger.api.factories;

import io.swagger.api.SpeakersApiService;
import io.swagger.api.impl.SpeakersApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-04-17T23:19:33.966Z")
public class SpeakersApiServiceFactory {
    private final static SpeakersApiService service = new SpeakersApiServiceImpl();

    public static SpeakersApiService getSpeakersApi() {
        return service;
    }
}
