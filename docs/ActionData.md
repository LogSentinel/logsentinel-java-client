
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
BUSINESS_LOGIC_ENTRY | &quot;BUSINESS_LOGIC_ENTRY&quot;
DATABASE_QUERY | &quot;DATABASE_QUERY&quot;
SYSTEM_EVENT | &quot;SYSTEM_EVENT&quot;
NETWORK_EVENT | &quot;NETWORK_EVENT&quot;
ANONYMIZED_ENTRY | &quot;ANONYMIZED_ENTRY&quot;
SPECIALIZED_BUSINESS_LOGIC_ENTRY | &quot;SPECIALIZED_BUSINESS_LOGIC_ENTRY&quot;
DOCUMENT | &quot;DOCUMENT&quot;
FLOW_LOG | &quot;FLOW_LOG&quot;



