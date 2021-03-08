
# UserDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**admin** | **Boolean** |  |  [optional]
**allowedApplicationIds** | [**List&lt;UUID&gt;**](UUID.md) |  |  [optional]
**base64ProfilePicture** | **String** |  |  [optional]
**confirmed** | **Boolean** |  |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**darkThemeEnabled** | **Boolean** |  |  [optional]
**demo** | **Boolean** |  |  [optional]
**email** | **String** |  |  [optional]
**expirationDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**expired** | **Boolean** |  |  [optional]
**features** | **List&lt;String&gt;** |  |  [optional]
**hasPassword** | **Boolean** |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**integratedCloudProviderId** | **String** |  |  [optional]
**language** | [**LanguageEnum**](#LanguageEnum) |  |  [optional]
**ldapProvided** | **Boolean** |  |  [optional]
**names** | **String** |  |  [optional]
**organizationId** | [**UUID**](UUID.md) |  |  [optional]
**organizationName** | **String** |  |  [optional]
**organizationRole** | [**OrganizationRoleEnum**](#OrganizationRoleEnum) |  |  [optional]
**paymentsEnabled** | **Boolean** |  |  [optional]
**position** | **String** |  |  [optional]
**profilePicture** | [**ByteBuffer**](ByteBuffer.md) |  |  [optional]
**publicUser** | **Boolean** |  |  [optional]
**receiveUpdates** | **Boolean** |  |  [optional]
**seasonedUser** | **Boolean** |  |  [optional]
**timezone** | **String** |  |  [optional]
**twoFactorAuthEnabled** | **Boolean** |  |  [optional]
**twoFactorAuthKey** | **String** |  |  [optional]
**whitelabelStyling** | [**WhitelabelStyling**](WhitelabelStyling.md) |  |  [optional]


<a name="LanguageEnum"></a>
## Enum: LanguageEnum
Name | Value
---- | -----
EN | &quot;EN&quot;
BG | &quot;BG&quot;
ZH | &quot;ZH&quot;


<a name="OrganizationRoleEnum"></a>
## Enum: OrganizationRoleEnum
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



