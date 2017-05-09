# swagger-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.api.AgendaApi;

public class AgendaApiExample {

    public static void main(String[] args) {
        AgendaApi apiInstance = new AgendaApi();
        String searchString = "searchString_example"; // String | pass an optional search string for looking up events
        Integer skip = 56; // Integer | number of records to skip for pagination
        Integer limit = 56; // Integer | maximum number of records to return
        try {
            List<AgendaItem> result = apiInstance.agendaGet(searchString, skip, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgendaApi#agendaGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://virtserver.swaggerhub.com/DockerCon17/DockerCon17/1.0.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AgendaApi* | [**agendaGet**](docs/AgendaApi.md#agendaGet) | **GET** /agenda | Searches list of events
*AgendaApi* | [**agendaPost**](docs/AgendaApi.md#agendaPost) | **POST** /agenda | Adds an event
*SpeakersApi* | [**speakersGet**](docs/SpeakersApi.md#speakersGet) | **GET** /speakers | Searches list of speakers
*SpeakersApi* | [**speakersPost**](docs/SpeakersApi.md#speakersPost) | **POST** /speakers | Adds a speaker


## Documentation for Models

 - [AgendaItem](docs/AgendaItem.md)
 - [SpeakerItem](docs/SpeakerItem.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@swaggerhub.com

