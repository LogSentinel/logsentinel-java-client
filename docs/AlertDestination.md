
# AlertDestination

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** |  |  [optional]
**created** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**customHeaders** | **List&lt;String&gt;** |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**name** | **String** |  |  [optional]
**organizationId** | [**UUID**](UUID.md) |  |  [optional]
**recipients** | **List&lt;String&gt;** |  |  [optional]
**recipientsNames** | **List&lt;String&gt;** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**updated** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
EMAIL | &quot;EMAIL&quot;
TELEGRAM | &quot;TELEGRAM&quot;
URL | &quot;URL&quot;



