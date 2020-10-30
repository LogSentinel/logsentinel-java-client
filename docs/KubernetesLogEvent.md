
# KubernetesLogEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annotations** | **Map&lt;String, String&gt;** |  |  [optional]
**auditID** | [**UUID**](UUID.md) |  |  [optional]
**impersonatedUser** | [**KubernetesLogUser**](KubernetesLogUser.md) |  |  [optional]
**level** | [**LevelEnum**](#LevelEnum) |  |  [optional]
**objectRef** | [**KubernetesLogObjectRef**](KubernetesLogObjectRef.md) |  |  [optional]
**requestObject** | **String** |  |  [optional]
**requestReceivedTimestamp** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**requestURI** | **String** |  |  [optional]
**responseObject** | **String** |  |  [optional]
**responseStatus** | [**KubernetesLogResponseStatus**](KubernetesLogResponseStatus.md) |  |  [optional]
**sourceIPs** | **List&lt;String&gt;** |  |  [optional]
**stage** | **String** |  |  [optional]
**stateTimestamp** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**user** | [**KubernetesLogUser**](KubernetesLogUser.md) |  |  [optional]
**userAgent** | **String** |  |  [optional]
**verb** | **String** |  |  [optional]


<a name="LevelEnum"></a>
## Enum: LevelEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
METADATA | &quot;Metadata&quot;
REQUEST | &quot;Request&quot;
REQUESTRESPONSE | &quot;RequestResponse&quot;



