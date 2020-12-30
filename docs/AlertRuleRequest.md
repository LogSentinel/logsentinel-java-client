
# AlertRuleRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregationPeriod** | **String** |  |  [optional]
**aggregationType** | [**AggregationTypeEnum**](#AggregationTypeEnum) |  |  [optional]
**alertDestinationIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**applicationIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**enabled** | **Boolean** |  |  [optional]
**filterBy** | **String** |  |  [optional]
**groupByField** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**riskLevel** | **Integer** |  |  [optional]
**searchPeriod** | **String** |  |  [optional]
**tags** | **List&lt;String&gt;** |  |  [optional]
**thresholdType** | [**ThresholdTypeEnum**](#ThresholdTypeEnum) |  |  [optional]
**thresholdValue** | **Double** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]


<a name="AggregationTypeEnum"></a>
## Enum: AggregationTypeEnum
Name | Value
---- | -----
COUNT | &quot;COUNT&quot;
AVG | &quot;AVG&quot;
SUM | &quot;SUM&quot;


<a name="ThresholdTypeEnum"></a>
## Enum: ThresholdTypeEnum
Name | Value
---- | -----
ABOVE | &quot;ABOVE&quot;
BELOW | &quot;BELOW&quot;
BOTH | &quot;BOTH&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ST_DEV | &quot;ST_DEV&quot;
MEAN | &quot;MEAN&quot;
FIXED | &quot;FIXED&quot;



