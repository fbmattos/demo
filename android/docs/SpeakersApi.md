# SpeakersApi

All URIs are relative to *https://virtserver.swaggerhub.com/DockerCon17/DockerCon17/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**speakersGet**](SpeakersApi.md#speakersGet) | **GET** /speakers | Searches list of speakers
[**speakersPost**](SpeakersApi.md#speakersPost) | **POST** /speakers | Adds a speaker


<a name="speakersGet"></a>
# **speakersGet**
> List&lt;SpeakerItem&gt; speakersGet(searchString, skip, limit)

Searches list of speakers

By passing in the appropriate options, you can search for speakers in the system 

### Example
```java
// Import classes:
//import io.swagger.client.api.SpeakersApi;

SpeakersApi apiInstance = new SpeakersApi();
String searchString = "searchString_example"; // String | pass an optional search string for looking up speakers
Integer skip = 56; // Integer | number of records to skip for pagination
Integer limit = 56; // Integer | maximum number of records to return
try {
    List<SpeakerItem> result = apiInstance.speakersGet(searchString, skip, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeakersApi#speakersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchString** | **String**| pass an optional search string for looking up speakers | [optional]
 **skip** | **Integer**| number of records to skip for pagination | [optional]
 **limit** | **Integer**| maximum number of records to return | [optional]

### Return type

[**List&lt;SpeakerItem&gt;**](SpeakerItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="speakersPost"></a>
# **speakersPost**
> speakersPost(speakerItem)

Adds a speaker

Adds a speaker to the system

### Example
```java
// Import classes:
//import io.swagger.client.api.SpeakersApi;

SpeakersApi apiInstance = new SpeakersApi();
SpeakerItem speakerItem = new SpeakerItem(); // SpeakerItem | Speaker to add
try {
    apiInstance.speakersPost(speakerItem);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeakersApi#speakersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **speakerItem** | [**SpeakerItem**](SpeakerItem.md)| Speaker to add | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

