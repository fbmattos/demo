# DockerCon2017Api.SpeakersApi

All URIs are relative to *https://virtserver.swaggerhub.com/DockerCon17/DockerCon17/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**speakersGet**](SpeakersApi.md#speakersGet) | **GET** /speakers | Searches list of speakers
[**speakersPost**](SpeakersApi.md#speakersPost) | **POST** /speakers | Adds a speaker


<a name="speakersGet"></a>
# **speakersGet**
> [SpeakerItem] speakersGet(opts)

Searches list of speakers

By passing in the appropriate options, you can search for speakers in the system 

### Example
```javascript
var DockerCon2017Api = require('docker_con_2017_api');

var apiInstance = new DockerCon2017Api.SpeakersApi();

var opts = { 
  'searchString': "searchString_example", // String | pass an optional search string for looking up speakers
  'skip': 56, // Number | number of records to skip for pagination
  'limit': 56 // Number | maximum number of records to return
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.speakersGet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchString** | **String**| pass an optional search string for looking up speakers | [optional] 
 **skip** | **Number**| number of records to skip for pagination | [optional] 
 **limit** | **Number**| maximum number of records to return | [optional] 

### Return type

[**[SpeakerItem]**](SpeakerItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="speakersPost"></a>
# **speakersPost**
> speakersPost(opts)

Adds a speaker

Adds a speaker to the system

### Example
```javascript
var DockerCon2017Api = require('docker_con_2017_api');

var apiInstance = new DockerCon2017Api.SpeakersApi();

var opts = { 
  'speakerItem': new DockerCon2017Api.SpeakerItem() // SpeakerItem | Speaker to add
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.speakersPost(opts, callback);
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

