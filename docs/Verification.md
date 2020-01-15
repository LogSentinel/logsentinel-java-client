
# Verification

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicationId** | [**UUID**](UUID.md) |  |  [optional]
**attemptedHash** | **String** |  |  [optional]
**auditLogEntryId** | [**UUID**](UUID.md) |  |  [optional]
**created** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**failure** | [**FailureEnum**](#FailureEnum) |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]


<a name="FailureEnum"></a>
## Enum: FailureEnum
Name | Value
---- | -----
HASH_NOT_FOUND | &quot;HASH_NOT_FOUND&quot;
HASH_MISMATCH | &quot;HASH_MISMATCH&quot;
SEARCH_ENGINE_AND_DB_MISMATCH | &quot;SEARCH_ENGINE_AND_DB_MISMATCH&quot;
MISSING_PREVIOUS_ENTRY | &quot;MISSING_PREVIOUS_ENTRY&quot;
MISSING_DB_ENTRY | &quot;MISSING_DB_ENTRY&quot;
TIMESTAMP_VALIDATION_FAILED | &quot;TIMESTAMP_VALIDATION_FAILED&quot;
TIMESTAMP_GROUP_HASH_MISMATCH | &quot;TIMESTAMP_GROUP_HASH_MISMATCH&quot;
SIGNATURE_MISMATCH | &quot;SIGNATURE_MISMATCH&quot;
MISSING_SIGNATURE | &quot;MISSING_SIGNATURE&quot;
MISSING_PREVIOUS_TIMESTAMP_TOKEN | &quot;MISSING_PREVIOUS_TIMESTAMP_TOKEN&quot;
PREVIOUS_TIMESTAMP_TOKEN_HASH_MISMATCH | &quot;PREVIOUS_TIMESTAMP_TOKEN_HASH_MISMATCH&quot;
TIMESTAMP_GROUP_INVALID | &quot;TIMESTAMP_GROUP_INVALID&quot;
ETHEREUM_STORED_DATA_NOT_FOUND | &quot;ETHEREUM_STORED_DATA_NOT_FOUND&quot;
ETHEREUM_CONSISTENCY_PROOF_FAILED | &quot;ETHEREUM_CONSISTENCY_PROOF_FAILED&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
MANUAL | &quot;MANUAL&quot;
API_CALL | &quot;API_CALL&quot;
BACKGROUND | &quot;BACKGROUND&quot;



