
# ActionChainAlertRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actions** | **List&lt;String&gt;** |  |  [optional]
**aggregationPeriod** | **String** |  |  [optional]
**alertDestinationIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**applicationIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**automaticCase** | **Boolean** |  |  [optional]
**count** | **List&lt;Integer&gt;** |  |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**description** | **String** |  |  [optional]
**distinctByFields** | **List&lt;String&gt;** |  |  [optional]
**enabled** | **Boolean** |  |  [optional]
**entityType** | **String** |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**initialAction** | **String** |  |  [optional]
**insideWorkingHours** | **Boolean** |  |  [optional]
**joinAlertsPeriod** | **Integer** |  |  [optional]
**joinAlertsPeriodType** | [**JoinAlertsPeriodTypeEnum**](#JoinAlertsPeriodTypeEnum) |  |  [optional]
**less** | **List&lt;Boolean&gt;** |  |  [optional]
**matchParam** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**organizationId** | [**UUID**](UUID.md) |  |  [optional]
**percentage** | **Integer** |  |  [optional]
**queries** | **List&lt;String&gt;** |  |  [optional]
**resultDisplayAggregationField** | **String** |  |  [optional]
**riskLevel** | **Integer** |  |  [optional]
**searchPeriod** | **String** |  |  [optional]
**sumAction** | **String** |  |  [optional]
**sumActionTypes** | **String** |  |  [optional]
**sumTimeFrame** | **Long** |  |  [optional]
**sumValuePath** | **String** |  |  [optional]
**suppressionSettings** | [**SuppressionSettings**](SuppressionSettings.md) |  |  [optional]
**tags** | **List&lt;String&gt;** |  |  [optional]
**timeFrames** | **List&lt;Long&gt;** |  |  [optional]
**topFieldsCount** | **Integer** |  |  [optional]
**updated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**withActorsOnly** | **Boolean** |  |  [optional]


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



