package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.SpeakersApiService;
import io.swagger.api.factories.SpeakersApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.SpeakerItem;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/speakers")


@io.swagger.annotations.Api(description = "the speakers API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-04-18T21:50:11.143Z")
public class SpeakersApi  {
   private final SpeakersApiService delegate = SpeakersApiServiceFactory.getSpeakersApi();

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Searches list of speakers", notes = "By passing in the appropriate options, you can search for speakers in the system ", response = SpeakerItem.class, responseContainer = "List", tags={ "speakers", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Search results matching criteria", response = SpeakerItem.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad input parameter", response = SpeakerItem.class, responseContainer = "List") })
    public Response speakersGet(@ApiParam(value = "pass an optional search string for looking up speakers") @QueryParam("searchString") String searchString
,@ApiParam(value = "number of records to skip for pagination") @QueryParam("skip") Integer skip
,@ApiParam(value = "maximum number of records to return") @QueryParam("limit") Integer limit
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.speakersGet(searchString,skip,limit,securityContext);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Adds a speaker", notes = "Adds a speaker to the system", response = void.class, tags={ "speakers", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "item created", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "invalid input, object invalid", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "an existing item already exists", response = void.class) })
    public Response speakersPost(@ApiParam(value = "Speaker to add" ) SpeakerItem speakerItem
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.speakersPost(speakerItem,securityContext);
    }
}
