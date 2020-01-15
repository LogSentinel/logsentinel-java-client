
# AlertRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregationPeriod** | **String** |  |  [optional]
**aggregationType** | [**AggregationTypeEnum**](#AggregationTypeEnum) |  |  [optional]
**alertDestinationIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**applicationId** | [**UUID**](UUID.md) |  |  [optional]
**created** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**enabled** | **Boolean** |  |  [optional]
**groupByField** | **String** |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**insideWorkingHours** | **Boolean** |  |  [optional]
**name** | **String** |  |  [optional]
**organizationId** | [**UUID**](UUID.md) |  |  [optional]
**searchPeriod** | **String** |  |  [optional]
**thresholdType** | [**ThresholdTypeEnum**](#ThresholdTypeEnum) |  |  [optional]
**thresholdValue** | **Double** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**updated** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]


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



