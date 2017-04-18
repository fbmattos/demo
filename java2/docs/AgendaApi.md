# AgendaApi

All URIs are relative to *https://virtserver.swaggerhub.com/DockerCon17/DockerCon17/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**agendaGet**](AgendaApi.md#agendaGet) | **GET** /agenda | Searches list of events
[**agendaPost**](AgendaApi.md#agendaPost) | **POST** /agenda | Adds an event


<a name="agendaGet"></a>
# **agendaGet**
> List&lt;EventItem&gt; agendaGet(searchString, skip, limit)

Searches list of events

By passing in the appropriate options, you can search for available events in the system 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgendaApi;


AgendaApi apiInstance = new AgendaApi();
String searchString = "searchString_example"; // String | pass an optional search string for looking up events
Integer skip = 56; // Integer | number of records to skip for pagination
Integer limit = 56; // Integer | maximum number of records to return
try {
    List<EventItem> result = apiInstance.agendaGet(searchString, skip, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgendaApi#agendaGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchString** | **String**| pass an optional search string for looking up events | [optional]
 **skip** | **Integer**| number of records to skip for pagination | [optional]
 **limit** | **Integer**| maximum number of records to return | [optional]

### Return type

[**List&lt;EventItem&gt;**](EventItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="agendaPost"></a>
# **agendaPost**
> agendaPost(eventItem)

Adds an event

Adds an event to the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgendaApi;


AgendaApi apiInstance = new AgendaApi();
EventItem eventItem = new EventItem(); // EventItem | Event to add
try {
    apiInstance.agendaPost(eventItem);
} catch (ApiException e) {
    System.err.println("Exception when calling AgendaApi#agendaPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventItem** | [**EventItem**](EventItem.md)| Event to add | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

