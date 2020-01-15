
# AlertRuleRun

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actualValue** | **Double** |  |  [optional]
**alertRuleId** | [**UUID**](UUID.md) |  |  [optional]
**alertRuleName** | **String** |  |  [optional]
**created** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**executionDuration** | **Long** |  |  [optional]
**fired** | **Boolean** |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**organizationId** | [**UUID**](UUID.md) |  |  [optional]
**threshold** | **Double** |  |  [optional]
**thresholdType** | [**ThresholdTypeEnum**](#ThresholdTypeEnum) |  |  [optional]


<a name="ThresholdTypeEnum"></a>
## Enum: ThresholdTypeEnum
Name | Value
---- | -----
ABOVE | &quot;ABOVE&quot;
BELOW | &quot;BELOW&quot;
BOTH | &quot;BOTH&quot;



