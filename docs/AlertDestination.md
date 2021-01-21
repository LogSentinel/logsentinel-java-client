
# AlertDestination

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**automatedResponseSpecs** | **Map&lt;String, String&gt;** |  |  [optional]
**code** | **String** |  |  [optional]
**created** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**customHeaders** | **List&lt;String&gt;** |  |  [optional]
**filePushTarget** | [**FilePushTargetEnum**](#FilePushTargetEnum) |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**manualAfterTriage** | **Boolean** |  |  [optional]
**name** | **String** |  |  [optional]
**organizationId** | [**UUID**](UUID.md) |  |  [optional]
**recipients** | **List&lt;String&gt;** |  |  [optional]
**recipientsNames** | **List&lt;String&gt;** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**updated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]


<a name="FilePushTargetEnum"></a>
## Enum: FilePushTargetEnum
Name | Value
---- | -----
LOCAL | &quot;LOCAL&quot;
FTP | &quot;FTP&quot;
SCP | &quot;SCP&quot;
S3 | &quot;S3&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
EMAIL | &quot;EMAIL&quot;
TELEGRAM | &quot;TELEGRAM&quot;
URL | &quot;URL&quot;
IFTTT | &quot;IFTTT&quot;
ZAPIER | &quot;ZAPIER&quot;
COMMAND | &quot;COMMAND&quot;
PYTHON_SCRIPT | &quot;PYTHON_SCRIPT&quot;
SMS | &quot;SMS&quot;
FILE_PUSH | &quot;FILE_PUSH&quot;



