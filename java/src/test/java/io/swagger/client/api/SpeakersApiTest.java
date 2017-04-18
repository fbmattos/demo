package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.SpeakerItem;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SpeakersApi
 */
public class SpeakersApiTest {

    private final SpeakersApi api = new SpeakersApi();

    
    /**
     * Searches list of speakers
     *
     * By passing in the appropriate options, you can search for speakers in the system 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void speakersGetTest() throws ApiException {
        String searchString = null;
        Integer skip = null;
        Integer limit = null;
        // List<SpeakerItem> response = api.speakersGet(searchString, skip, limit);

        // TODO: test validations
    }
    
    /**
     * Adds a speaker
     *
     * Adds a speaker to the system
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void speakersPostTest() throws ApiException {
        SpeakerItem speakerItem = null;
        // api.speakersPost(speakerItem);

        // TODO: test validations
    }
    
}
