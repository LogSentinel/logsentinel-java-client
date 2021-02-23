
# AutomatedResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**command** | **String** |  |  [optional]
**commandParameter** | **String** |  |  [optional]
**context** | [**List&lt;AuditLogEntry&gt;**](AuditLogEntry.md) |  |  [optional]
**pythonScript** | **String** |  |  [optional]
**targetHost** | **String** |  |  [optional]
**targetType** | [**TargetTypeEnum**](#TargetTypeEnum) |  |  [optional]


<a name="TargetTypeEnum"></a>
## Enum: TargetTypeEnum
Name | Value
---- | -----
WINDOWS | &quot;WINDOWS&quot;
MACOS | &quot;MACOS&quot;
LINUX | &quot;LINUX&quot;
FIREWALL | &quot;FIREWALL&quot;
ACTIVE_DIRECTORY | &quot;ACTIVE_DIRECTORY&quot;



