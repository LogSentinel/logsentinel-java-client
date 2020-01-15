
# AuditLogEntry

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **String** |  |  [optional]
**actorDisplayName** | **String** |  |  [optional]
**actorId** | **String** |  |  [optional]
**actorRoles** | **List&lt;String&gt;** |  |  [optional]
**additionalParams** | **Map&lt;String, String&gt;** |  |  [optional]
**applicationId** | [**UUID**](UUID.md) |  |  [optional]
**details** | **String** |  |  [optional]
**encryptedKeywordsList** | **List&lt;String&gt;** |  |  [optional]
**entityId** | **String** |  |  [optional]
**entityType** | **String** |  |  [optional]
**entryType** | **String** |  |  [optional]
**hash** | **String** |  |  [optional]
**hashVersion** | **Integer** |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**insideWorkingHours** | **Boolean** |  |  [optional]
**ipAddress** | **String** |  |  [optional]
**logLevel** | [**LogLevelEnum**](#LogLevelEnum) |  |  [optional]
**numericParams** | **Map&lt;String, Double&gt;** |  |  [optional]
**previousEntryId** | [**UUID**](UUID.md) |  |  [optional]
**standaloneHash** | **String** |  |  [optional]
**timestamp** | **Long** |  |  [optional]
**timestampGroupHash** | **String** |  |  [optional]
**timestampGroupSize** | **Integer** |  |  [optional]
**timestampTime** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**timestampTokenId** | [**UUID**](UUID.md) |  |  [optional]


<a name="LogLevelEnum"></a>
## Enum: LogLevelEnum
Name | Value
---- | -----
TRACE | &quot;TRACE&quot;
DEBUG | &quot;DEBUG&quot;
INFO | &quot;INFO&quot;
WARN | &quot;WARN&quot;
ERROR | &quot;ERROR&quot;
CRITICAL | &quot;CRITICAL&quot;
FATAL | &quot;FATAL&quot;



