# DockerCon2017Api.AgendaApi

All URIs are relative to *https://virtserver.swaggerhub.com/DockerCon17/DockerCon17/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**agendaGet**](AgendaApi.md#agendaGet) | **GET** /agenda | Searches list of events
[**agendaPost**](AgendaApi.md#agendaPost) | **POST** /agenda | Adds an event


<a name="agendaGet"></a>
# **agendaGet**
> [AgendaItem] agendaGet(opts)

Searches list of events

By passing in the appropriate options, you can search for available events in the system 

### Example
```javascript
var DockerCon2017Api = require('docker_con_2017_api');

var apiInstance = new DockerCon2017Api.AgendaApi();

var opts = { 
  'searchString': "searchString_example", // String | pass an optional search string for looking up events
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
apiInstance.agendaGet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchString** | **String**| pass an optional search string for looking up events | [optional] 
 **skip** | **Number**| number of records to skip for pagination | [optional] 
 **limit** | **Number**| maximum number of records to return | [optional] 

### Return type

[**[AgendaItem]**](AgendaItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="agendaPost"></a>
# **agendaPost**
> agendaPost(opts)

Adds an event

Adds an event to the system

### Example
```javascript
var DockerCon2017Api = require('docker_con_2017_api');

var apiInstance = new DockerCon2017Api.AgendaApi();

var opts = { 
  'eventItem': new DockerCon2017Api.AgendaItem() // AgendaItem | Event to add
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.agendaPost(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventItem** | [**AgendaItem**](AgendaItem.md)| Event to add | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

