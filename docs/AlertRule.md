
# AlertRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregationPeriod** | **String** |  |  [optional]
**aggregationType** | [**AggregationTypeEnum**](#AggregationTypeEnum) |  |  [optional]
**alertDestinationIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**applicationIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**automaticCase** | **Boolean** |  |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**description** | **String** |  |  [optional]
**displayPreviousAlertsSearchDays** | **Integer** |  |  [optional]
**enabled** | **Boolean** |  |  [optional]
**filterBy** | **String** |  |  [optional]
**groupByField** | **String** |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**insideWorkingHours** | **Boolean** |  |  [optional]
**joinAlertsPeriod** | **Integer** |  |  [optional]
**joinAlertsPeriodType** | [**JoinAlertsPeriodTypeEnum**](#JoinAlertsPeriodTypeEnum) |  |  [optional]
**name** | **String** |  |  [optional]
**organizationId** | [**UUID**](UUID.md) |  |  [optional]
**resultDisplayAggregationField** | **String** |  |  [optional]
**riskLevel** | **Integer** |  |  [optional]
**ruleType** | [**RuleTypeEnum**](#RuleTypeEnum) |  |  [optional]
**searchPeriod** | **String** |  |  [optional]
**suppressionSettings** | [**SuppressionSettings**](SuppressionSettings.md) |  |  [optional]
**tags** | **List&lt;String&gt;** |  |  [optional]
**thresholdType** | [**ThresholdTypeEnum**](#ThresholdTypeEnum) |  |  [optional]
**thresholdValue** | **Double** |  |  [optional]
**topFieldsCount** | **Integer** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**updated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]


<a name="AggregationTypeEnum"></a>
## Enum: AggregationTypeEnum
Name | Value
---- | -----
COUNT | &quot;COUNT&quot;
AVG | &quot;AVG&quot;
SUM | &quot;SUM&quot;
MAX | &quot;MAX&quot;
MIN | &quot;MIN&quot;


<a name="JoinAlertsPeriodTypeEnum"></a>
## Enum: JoinAlertsPeriodTypeEnum
Name | Value
---- | -----
SECOND | &quot;SECOND&quot;
MINUTE | &quot;MINUTE&quot;
HOUR | &quot;HOUR&quot;
DAY | &quot;DAY&quot;
WEEK | &quot;WEEK&quot;
MONTH | &quot;MONTH&quot;
YEAR | &quot;YEAR&quot;


<a name="RuleTypeEnum"></a>
## Enum: RuleTypeEnum
Name | Value
---- | -----
REGULAR | &quot;REGULAR&quot;
HEALTHCHECK | &quot;HEALTHCHECK&quot;
BEHAVIOR | &quot;BEHAVIOR&quot;


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



