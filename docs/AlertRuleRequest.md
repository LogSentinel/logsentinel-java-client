
# AlertRuleRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregationPeriod** | **String** |  |  [optional]
**aggregationType** | [**AggregationTypeEnum**](#AggregationTypeEnum) |  |  [optional]
**alertDestinationIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**applicationIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**enabled** | **Boolean** |  |  [optional]
**groupByField** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**searchPeriod** | **String** |  |  [optional]
**thresholdValue** | **Double** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]


<a name="AggregationTypeEnum"></a>
## Enum: AggregationTypeEnum
Name | Value
---- | -----
COUNT | &quot;COUNT&quot;
AVG | &quot;AVG&quot;
SUM | &quot;SUM&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ST_DEV | &quot;ST_DEV&quot;
MEAN | &quot;MEAN&quot;
FIXED | &quot;FIXED&quot;



