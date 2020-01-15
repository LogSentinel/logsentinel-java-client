
# UpdateApplicationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**containsPersonalData** | **Boolean** |  |  [optional]
**detailsTransformationScript** | **String** |  |  [optional]
**displayedDetailsFields** | **String** |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**ipWhiteList** | **List&lt;String&gt;** |  |  [optional]
**latestHashRecipientEmails** | **List&lt;String&gt;** |  |  [optional]
**logLevelErrorReportRecipientEmails** | **List&lt;String&gt;** |  |  [optional]
**logLevelRegexes** | **Map&lt;String, String&gt;** |  |  [optional]
**metadataExtractionPaths** | [**MetadataExtractionPaths**](MetadataExtractionPaths.md) |  |  [optional]
**name** | **String** |  |  [optional]
**openDataAnonymizationRegexes** | **List&lt;String&gt;** |  |  [optional]
**openDataAnonymizeBodyFields** | **List&lt;String&gt;** |  |  [optional]
**openDataEnabled** | **Boolean** |  |  [optional]
**openDataWhitelistRegexes** | **List&lt;String&gt;** |  |  [optional]
**partialVerificationPeriodMinutes** | **Integer** |  |  [optional]
**retentionMonths** | **Integer** |  |  [optional]
**signatureVerificationPublicKeys** | **List&lt;String&gt;** |  |  [optional]
**storeHashesInEthereum** | **Boolean** |  |  [optional]
**verificationFailureReportRecipientEmails** | **List&lt;String&gt;** |  |  [optional]
**verificationPeriodMinutes** | **Integer** |  |  [optional]
**warnLevel** | [**WarnLevelEnum**](#WarnLevelEnum) |  |  [optional]


<a name="WarnLevelEnum"></a>
## Enum: WarnLevelEnum
Name | Value
---- | -----
TRACE | &quot;TRACE&quot;
DEBUG | &quot;DEBUG&quot;
INFO | &quot;INFO&quot;
WARN | &quot;WARN&quot;
ERROR | &quot;ERROR&quot;
CRITICAL | &quot;CRITICAL&quot;
FATAL | &quot;FATAL&quot;



