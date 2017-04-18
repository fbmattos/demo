package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.EventItem;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AgendaApi
 */
public class AgendaApiTest {

    private final AgendaApi api = new AgendaApi();

    
    /**
     * Searches list of events
     *
     * By passing in the appropriate options, you can search for available events in the system 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void agendaGetTest() throws ApiException {
        String searchString = null;
        Integer skip = null;
        Integer limit = null;
        // List<EventItem> response = api.agendaGet(searchString, skip, limit);

        // TODO: test validations
    }
    
    /**
     * Adds an event
     *
     * Adds an event to the system
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void agendaPostTest() throws ApiException {
        EventItem eventItem = null;
        // api.agendaPost(eventItem);

        // TODO: test validations
    }
    
}
