
# GDPRRegisterRecordDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auditTrailCorrelationKey** | **String** |  |  [optional]
**branch** | **String** |  |  [optional]
**controller** | [**GDPRResponsibleEntity**](GDPRResponsibleEntity.md) |  |  [optional]
**controllersDescription** | **String** |  |  [optional]
**created** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]
**dataRecipientCategories** | [**List&lt;DataRecipientCategoriesEnum&gt;**](#List&lt;DataRecipientCategoriesEnum&gt;) |  |  [optional]
**dataRecipientCategoriesOther** | **List&lt;String&gt;** |  |  [optional]
**dataSubjectCategory** | [**DataSubjectCategoryEnum**](#DataSubjectCategoryEnum) |  |  [optional]
**dataSubjectCategoryOther** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**jointControllers** | [**List&lt;GDPRResponsibleEntity&gt;**](GDPRResponsibleEntity.md) |  |  [optional]
**notes** | **String** |  |  [optional]
**organizationRole** | [**OrganizationRoleEnum**](#OrganizationRoleEnum) |  |  [optional]
**personalDataCategory** | [**PersonalDataCategoryEnum**](#PersonalDataCategoryEnum) |  |  [optional]
**personalDataCategoryOther** | **String** |  |  [optional]
**personalDataFields** | **String** |  |  [optional]
**processOwner** | **String** |  |  [optional]
**processingActivityCode** | **String** |  |  [optional]
**processingActivityName** | **String** |  |  [optional]
**processingLegalBasis** | [**ProcessingLegalBasisEnum**](#ProcessingLegalBasisEnum) |  |  [optional]
**processor** | [**GDPRResponsibleEntity**](GDPRResponsibleEntity.md) |  |  [optional]
**purposes** | **List&lt;String&gt;** |  |  [optional]
**recipients** | [**List&lt;GDPRRecipient&gt;**](GDPRRecipient.md) |  |  [optional]
**relevantDepartment** | **String** |  |  [optional]
**retentionMonths** | **Integer** |  |  [optional]
**riskDescription** | **String** |  |  [optional]
**sensitivePersonalDataCategory** | [**SensitivePersonalDataCategoryEnum**](#SensitivePersonalDataCategoryEnum) |  |  [optional]
**software** | **String** |  |  [optional]
**subProcessors** | [**List&lt;GDPRResponsibleEntity&gt;**](GDPRResponsibleEntity.md) |  |  [optional]
**tags** | **List&lt;String&gt;** |  |  [optional]
**technicalMeasures** | [**List&lt;TechnicalMeasuresEnum&gt;**](#List&lt;TechnicalMeasuresEnum&gt;) |  |  [optional]
**technicalMeasuresOther** | **List&lt;String&gt;** |  |  [optional]
**thirdCountryTransferSafeguards** | **List&lt;String&gt;** |  |  [optional]
**thirdCountryTransfers** | **List&lt;String&gt;** |  |  [optional]
**updated** | [**LocalDateTime**](LocalDateTime.md) |  |  [optional]


<a name="List<DataRecipientCategoriesEnum>"></a>
## Enum: List&lt;DataRecipientCategoriesEnum&gt;
Name | Value
---- | -----
STAFF | &quot;STAFF&quot;
PUBLIC_AUTHORITY | &quot;PUBLIC_AUTHORITY&quot;
CONTRACTOR | &quot;CONTRACTOR&quot;
OTHER | &quot;OTHER&quot;


<a name="DataSubjectCategoryEnum"></a>
## Enum: DataSubjectCategoryEnum
Name | Value
---- | -----
EMPLOYEES | &quot;EMPLOYEES&quot;
JOB_CANDIDATES | &quot;JOB_CANDIDATES&quot;
CONTRACTORS | &quot;CONTRACTORS&quot;
CUSTOMERS | &quot;CUSTOMERS&quot;
USERS | &quot;USERS&quot;
SUPPLIERS | &quot;SUPPLIERS&quot;
OTHER | &quot;OTHER&quot;


<a name="OrganizationRoleEnum"></a>
## Enum: OrganizationRoleEnum
Name | Value
---- | -----
CONTROLLER | &quot;CONTROLLER&quot;
PROCESSOR | &quot;PROCESSOR&quot;


<a name="PersonalDataCategoryEnum"></a>
## Enum: PersonalDataCategoryEnum
Name | Value
---- | -----
EMPLOYEE_DATA | &quot;EMPLOYEE_DATA&quot;
CUSTOMER_DATA | &quot;CUSTOMER_DATA&quot;
USER_DATA | &quot;USER_DATA&quot;
CIVIL_STATUS | &quot;CIVIL_STATUS&quot;
PERSONAL_LIFE | &quot;PERSONAL_LIFE&quot;
FINANCIAL_DATA | &quot;FINANCIAL_DATA&quot;
LOCATION_DATA | &quot;LOCATION_DATA&quot;
SENSITIVE_DATA | &quot;SENSITIVE_DATA&quot;
CONTACT_DATA | &quot;CONTACT_DATA&quot;
IDENTIFICATION_DATA | &quot;IDENTIFICATION_DATA&quot;
OTHER | &quot;OTHER&quot;


<a name="ProcessingLegalBasisEnum"></a>
## Enum: ProcessingLegalBasisEnum
Name | Value
---- | -----
LEGITIMATE_INTEREST | &quot;LEGITIMATE_INTEREST&quot;
CONSENT | &quot;CONSENT&quot;
CONTRACT_ENFORCEMENT | &quot;CONTRACT_ENFORCEMENT&quot;
LEGAL_COMPLIANCE | &quot;LEGAL_COMPLIANCE&quot;
VITAL_INTERESTS_PROTECTION | &quot;VITAL_INTERESTS_PROTECTION&quot;
PUBLIC_INTEREST | &quot;PUBLIC_INTEREST&quot;


<a name="SensitivePersonalDataCategoryEnum"></a>
## Enum: SensitivePersonalDataCategoryEnum
Name | Value
---- | -----
RACIAL_OR_ETHNIC | &quot;RACIAL_OR_ETHNIC&quot;
POLITICAL_OPINION | &quot;POLITICAL_OPINION&quot;
RELIGIOUS_BELIEFS | &quot;RELIGIOUS_BELIEFS&quot;
TRADE_UNION_MEMBERSHIP | &quot;TRADE_UNION_MEMBERSHIP&quot;
GENETIC_DATA | &quot;GENETIC_DATA&quot;
BIOMETRIC_DATA | &quot;BIOMETRIC_DATA&quot;
HEALTH_DATA | &quot;HEALTH_DATA&quot;
SEX_LIFE_DATA | &quot;SEX_LIFE_DATA&quot;
CRIMINAL_CONVICTION_DATA | &quot;CRIMINAL_CONVICTION_DATA&quot;
MULTIPLE | &quot;MULTIPLE&quot;


<a name="List<TechnicalMeasuresEnum>"></a>
## Enum: List&lt;TechnicalMeasuresEnum&gt;
Name | Value
---- | -----
PSEUDONYMIZATION | &quot;PSEUDONYMIZATION&quot;
ENCRYPTION_AT_REST | &quot;ENCRYPTION_AT_REST&quot;
ENCRYPTION_IN_TRANSIT | &quot;ENCRYPTION_IN_TRANSIT&quot;
AUDITING_ACCESS | &quot;AUDITING_ACCESS&quot;
DATA_INTEGRITY_PROTECTION | &quot;DATA_INTEGRITY_PROTECTION&quot;
SOFTWARE_UPDATE_POLICY | &quot;SOFTWARE_UPDATE_POLICY&quot;
DATA_REDUNDANCY | &quot;DATA_REDUNDANCY&quot;



