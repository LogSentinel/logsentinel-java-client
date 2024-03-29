
# ApplicationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**automaticBehaviorMonitoring** | **Boolean** |  |  [optional]
**containsPersonalData** | **Boolean** |  |  [optional]
**dataMaskingPatterns** | **List&lt;String&gt;** |  |  [optional]
**defaultAlertDestinations** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**description** | **String** |  |  [optional]
**detailsTransformationScript** | **String** |  |  [optional]
**disabledThreatFeeds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**discardLogConditions** | **List&lt;String&gt;** |  |  [optional]
**displayedDetailsFields** | **String** |  |  [optional]
**extractAllFields** | **Boolean** |  |  [optional]
**extractionOverrideEnabled** | **Boolean** |  |  [optional]
**generateHashChain** | **Boolean** |  |  [optional]
**generateMerkleTree** | **Boolean** |  |  [optional]
**groupIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**ipWhiteList** | **List&lt;String&gt;** |  |  [optional]
**latestHashRecipientEmails** | **List&lt;String&gt;** |  |  [optional]
**logGroupingEnabled** | **Boolean** |  |  [optional]
**logLevelRegexes** | **Map&lt;String, String&gt;** |  |  [optional]
**metadataExtractionPaths** | [**MetadataExtractionPaths**](MetadataExtractionPaths.md) |  |  [optional]
**name** | **String** |  |  [optional]
**newThreatIntelAlertPeriodHours** | **Integer** |  |  [optional]
**normalizedActions** | **String** |  |  [optional]
**openDataAnonymizationRegexes** | **List&lt;String&gt;** |  |  [optional]
**openDataAnonymizeBodyFields** | **List&lt;String&gt;** |  |  [optional]
**openDataEnabled** | **Boolean** |  |  [optional]
**openDataWhitelistRegexes** | **List&lt;String&gt;** |  |  [optional]
**partialVerificationPeriodMinutes** | **Integer** |  |  [optional]
**propertiesForIdenticalEntries** | **List&lt;String&gt;** |  |  [optional]
**retentionDays** | **Integer** |  |  [optional]
**riskLevel** | **Integer** |  |  [optional]
**signatureVerificationPublicKeys** | **List&lt;String&gt;** |  |  [optional]
**skipThreatIntelligenceParams** | **Map&lt;String, String&gt;** |  |  [optional]
**skipThreatIntelligenceRegex** | **String** |  |  [optional]
**sourceCategory** | [**SourceCategoryEnum**](#SourceCategoryEnum) |  |  [optional]
**storeHashesInEthereum** | **Boolean** |  |  [optional]
**syslogHost** | **String** |  |  [optional]
**syslogIdentificationParamName** | **String** |  |  [optional]
**syslogIdentificationParamValue** | **String** |  |  [optional]
**verificationFailureReportRecipientEmails** | **List&lt;String&gt;** |  |  [optional]
**verificationPeriodMinutes** | **Integer** |  |  [optional]
**warnLevel** | [**WarnLevelEnum**](#WarnLevelEnum) |  |  [optional]


<a name="SourceCategoryEnum"></a>
## Enum: SourceCategoryEnum
Name | Value
---- | -----
CLOUD_INFRASTRUCTURE | &quot;CLOUD_INFRASTRUCTURE&quot;
NETWORK_APPLIANCE | &quot;NETWORK_APPLIANCE&quot;
DATABASE | &quot;DATABASE&quot;
ACTIVE_DIRECTORY | &quot;ACTIVE_DIRECTORY&quot;
ERP | &quot;ERP&quot;
ACCOUNTING | &quot;ACCOUNTING&quot;
HR_AND_PAYROLL | &quot;HR_AND_PAYROLL&quot;
SERVER_OS | &quot;SERVER_OS&quot;
FILE_SERVER | &quot;FILE_SERVER&quot;
EMAIL_SERVER | &quot;EMAIL_SERVER&quot;
WORKSTATION | &quot;WORKSTATION&quot;
WEB_SERVER | &quot;WEB_SERVER&quot;
ANTIVIRUS | &quot;ANTIVIRUS&quot;
VPN | &quot;VPN&quot;
DOMAIN_SPECIFIC_APPLICATION | &quot;DOMAIN_SPECIFIC_APPLICATION&quot;
SAAS | &quot;SAAS&quot;
IDS | &quot;IDS&quot;
VIDEOCONFERENCING | &quot;VIDEOCONFERENCING&quot;
CLOUD_OFFICE | &quot;CLOUD_OFFICE&quot;
OTHER | &quot;OTHER&quot;


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



