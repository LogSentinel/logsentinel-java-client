
# UserRegistrationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowedApplicationIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**attributes** | **Map&lt;String, String&gt;** |  |  [optional]
**awsCustomerId** | **String** |  |  [optional]
**email** | **String** |  |  [optional]
**expirationDate** | **String** |  |  [optional]
**industry** | **String** |  |  [optional]
**names** | **String** |  |  [optional]
**organizationName** | **String** |  |  [optional]
**password** | **String** |  |  [optional]
**position** | **String** |  |  [optional]
**role** | [**RoleEnum**](#RoleEnum) |  |  [optional]
**serverName** | **String** |  |  [optional]
**subscriptionPlanCode** | **String** |  |  [optional]
**timezone** | **String** |  |  [optional]


<a name="RoleEnum"></a>
## Enum: RoleEnum
Name | Value
---- | -----
ADMIN | &quot;ADMIN&quot;
AUDITOR | &quot;AUDITOR&quot;
SECURITY_ANALYST | &quot;SECURITY_ANALYST&quot;
SYSADMIN | &quot;SYSADMIN&quot;
DEVELOPER | &quot;DEVELOPER&quot;
MANAGER | &quot;MANAGER&quot;
IT | &quot;IT&quot;
BUSINESS_ANALYST | &quot;BUSINESS_ANALYST&quot;
PUBLIC_USER | &quot;PUBLIC_USER&quot;



