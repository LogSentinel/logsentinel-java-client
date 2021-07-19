
# ActionData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **String** |  |  [optional]
**details** | **String** |  |  [optional]
**entityId** | **String** |  |  [optional]
**entityType** | **String** |  |  [optional]
**entryType** | [**EntryTypeEnum**](#EntryTypeEnum) |  |  [optional]
**originalEventTimestamp** | **Long** |  |  [optional]
**tags** | **List&lt;String&gt;** |  |  [optional]


<a name="EntryTypeEnum"></a>
## Enum: EntryTypeEnum
Name | Value
---- | -----
SYSTEM_EVENT | &quot;SYSTEM_EVENT&quot;
NETWORK_EVENT | &quot;NETWORK_EVENT&quot;
AUTHENTICATION_EVENT | &quot;AUTHENTICATION_EVENT&quot;
EXTERNAL_ALERT | &quot;EXTERNAL_ALERT&quot;
AUDIT_LOG | &quot;AUDIT_LOG&quot;
WEBSITE_LOG | &quot;WEBSITE_LOG&quot;
BUSINESS_LOGIC_ENTRY | &quot;BUSINESS_LOGIC_ENTRY&quot;
DATABASE_QUERY | &quot;DATABASE_QUERY&quot;
ANONYMIZED_ENTRY | &quot;ANONYMIZED_ENTRY&quot;
SPECIALIZED_BUSINESS_LOGIC_ENTRY | &quot;SPECIALIZED_BUSINESS_LOGIC_ENTRY&quot;
DOCUMENT | &quot;DOCUMENT&quot;
EMAIL | &quot;EMAIL&quot;



