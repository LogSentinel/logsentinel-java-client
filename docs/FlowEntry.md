
# FlowEntry

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicationId** | [**UUID**](UUID.md) |  |  [optional]
**destinationIp** | **String** |  |  [optional]
**destinationPort** | **Integer** |  |  [optional]
**flowType** | [**FlowTypeEnum**](#FlowTypeEnum) |  |  [optional]
**ipDetails** | [**Map&lt;String, IPDetails&gt;**](IPDetails.md) |  |  [optional]
**numericParams** | **Map&lt;String, Long&gt;** |  |  [optional]
**originalEventTimestamp** | **Long** |  |  [optional]
**params** | **Map&lt;String, String&gt;** |  |  [optional]
**protocol** | **String** |  |  [optional]
**sourceCountry** | **String** |  |  [optional]
**sourceIp** | **String** |  |  [optional]
**sourcePort** | **Integer** |  |  [optional]


<a name="FlowTypeEnum"></a>
## Enum: FlowTypeEnum
Name | Value
---- | -----
NETFLOW | &quot;NETFLOW&quot;
SFLOW | &quot;SFLOW&quot;
JFLOW | &quot;JFLOW&quot;



