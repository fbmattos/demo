package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AgendaApiService;
import io.swagger.api.factories.AgendaApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.EventItem;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/agenda")


@io.swagger.annotations.Api(description = "the agenda API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-04-17T23:19:33.966Z")
public class AgendaApi  {
   private final AgendaApiService delegate = AgendaApiServiceFactory.getAgendaApi();

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Searches list of events", notes = "By passing in the appropriate options, you can search for available events in the system ", response = EventItem.class, responseContainer = "List", tags={ "agenda", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Search results matching criteria", response = EventItem.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad input parameter", response = EventItem.class, responseContainer = "List") })
    public Response agendaGet(@ApiParam(value = "pass an optional search string for looking up events") @QueryParam("searchString") String searchString
,@ApiParam(value = "number of records to skip for pagination") @QueryParam("skip") Integer skip
,@ApiParam(value = "maximum number of records to return") @QueryParam("limit") Integer limit
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.agendaGet(searchString,skip,limit,securityContext);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Adds an event", notes = "Adds an event to the system", response = void.class, tags={ "agenda", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "item created", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "invalid input, object invalid", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "an existing item already exists", response = void.class) })
    public Response agendaPost(@ApiParam(value = "Event to add" ) EventItem eventItem
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.agendaPost(eventItem,securityContext);
    }
}
