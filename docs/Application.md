
# Application

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**containsPersonalData** | **Boolean** |  |  [optional]
**created** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**detailsTransformationScript** | **String** |  |  [optional]
**displayedDetailsFields** | **String** |  |  [optional]
**genesisEntryId** | [**UUID**](UUID.md) |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**ipWhiteList** | **List&lt;String&gt;** |  |  [optional]
**latestEthereumTxHash** | **String** |  |  [optional]
**latestGlacierArchiveId** | **String** |  |  [optional]
**latestHashRecipientEmails** | **List&lt;String&gt;** |  |  [optional]
**logLevelErrorReportRecipientEmails** | **List&lt;String&gt;** |  |  [optional]
**logLevelRegexes** | **Map&lt;String, String&gt;** |  |  [optional]
**merkleTreeGenerationMinutes** | **Integer** |  |  [optional]
**metadataExtractionPaths** | [**MetadataExtractionPaths**](MetadataExtractionPaths.md) |  |  [optional]
**name** | **String** |  |  [optional]
**openDataAnonymizationRegexes** | **List&lt;String&gt;** |  |  [optional]
**openDataAnonymizeBodyFields** | **List&lt;String&gt;** |  |  [optional]
**openDataEnabled** | **Boolean** |  |  [optional]
**openDataWhitelistRegexes** | **List&lt;String&gt;** |  |  [optional]
**organizationId** | [**UUID**](UUID.md) |  |  [optional]
**partialVerificationPeriodMinutes** | **Integer** |  |  [optional]
**performVerification** | **Boolean** |  |  [optional]
**retentionMonths** | **Integer** |  |  [optional]
**signatureVerificationPublicKeys** | **List&lt;String&gt;** |  |  [optional]
**storeHashesInEthereum** | **Boolean** |  |  [optional]
**syslogId** | **String** |  |  [optional]
**updated** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
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



