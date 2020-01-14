
# APICredentialsOrganization

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicationId** | [**UUID**](UUID.md) |  |  [optional]
**created** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**id** | [**UUID**](UUID.md) |  |  [optional]
**name** | **String** |  |  [optional]
**organizationId** | [**UUID**](UUID.md) |  |  [optional]
**role** | [**RoleEnum**](#RoleEnum) |  |  [optional]
**secret** | **String** |  |  [optional]


<a name="RoleEnum"></a>
## Enum: RoleEnum
Name | Value
---- | -----
MANAGEMENT_API | &quot;MANAGEMENT_API&quot;
OWNING_ORGANIZATION | &quot;OWNING_ORGANIZATION&quot;
THIRD_PARTY_ORGANIZATION | &quot;THIRD_PARTY_ORGANIZATION&quot;
GLOBAL_MANAGEMENT_API | &quot;GLOBAL_MANAGEMENT_API&quot;
MULTITENANT_PARTNER_API | &quot;MULTITENANT_PARTNER_API&quot;



