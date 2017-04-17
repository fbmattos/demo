package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.SpeakerItem;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-04-17T23:19:33.966Z")
public abstract class SpeakersApiService {
    public abstract Response speakersGet(String searchString,Integer skip,Integer limit,SecurityContext securityContext) throws NotFoundException;
    public abstract Response speakersPost(SpeakerItem speakerItem,SecurityContext securityContext) throws NotFoundException;
}
