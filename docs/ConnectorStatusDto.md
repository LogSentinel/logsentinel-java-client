
# ConnectorStatusDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalMessage** | **String** |  |  [optional]
**connectorId** | **String** |  |  [optional]
**connectorName** | **String** |  |  [optional]
**dataSourceIds** | **List&lt;String&gt;** |  |  [optional]
**newlyCreated** | **Boolean** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**type** | **String** |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SYS_INIT | &quot;SYS_INIT&quot;
STARTUP | &quot;STARTUP&quot;
UP | &quot;UP&quot;
SOME_ISSUES | &quot;SOME_ISSUES&quot;
SEVERE_ERROR | &quot;SEVERE_ERROR&quot;
SHUTDOWN | &quot;SHUTDOWN&quot;
DOWN | &quot;DOWN&quot;



