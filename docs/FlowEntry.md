
# FlowEntry

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destinationIp** | **String** |  |  [optional]
**destinationPort** | **Integer** |  |  [optional]
**flowType** | [**FlowTypeEnum**](#FlowTypeEnum) |  |  [optional]
**numericParams** | **Map&lt;String, Double&gt;** |  |  [optional]
**originalEventTimestamp** | **Long** |  |  [optional]
**params** | **Map&lt;String, String&gt;** |  |  [optional]
**protocol** | **String** |  |  [optional]
**sourceIp** | **String** |  |  [optional]
**sourcePort** | **Integer** |  |  [optional]


<a name="FlowTypeEnum"></a>
## Enum: FlowTypeEnum
Name | Value
---- | -----
NETFLOW | &quot;NETFLOW&quot;
SFLOW | &quot;SFLOW&quot;
JFLOW | &quot;JFLOW&quot;



