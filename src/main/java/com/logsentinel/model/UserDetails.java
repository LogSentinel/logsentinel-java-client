/*
 * LogSentinel RESTful API
 * Read more at https://docs.logsentinel.com/
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.logsentinel.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.logsentinel.model.WhitelabelStyling;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * UserDetails
 */

public class UserDetails {
  @JsonProperty("admin")
  private Boolean admin = null;

  @JsonProperty("allowedApplicationIds")
  private List<UUID> allowedApplicationIds = null;

  @JsonProperty("base64ProfilePicture")
  private String base64ProfilePicture = null;

  @JsonProperty("confirmed")
  private Boolean confirmed = null;

  @JsonProperty("created")
  private LocalDateTime created = null;

  @JsonProperty("demo")
  private Boolean demo = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("expirationDate")
  private LocalDate expirationDate = null;

  @JsonProperty("expired")
  private Boolean expired = null;

  @JsonProperty("features")
  private List<String> features = null;

  @JsonProperty("hasPassword")
  private Boolean hasPassword = null;

  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("integratedCloudProviderId")
  private String integratedCloudProviderId = null;

  /**
   * Gets or Sets language
   */
  public enum LanguageEnum {
    EN("EN"),
    
    BG("BG"),
    
    ZH("ZH");

    private String value;

    LanguageEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LanguageEnum fromValue(String text) {
      for (LanguageEnum b : LanguageEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("language")
  private LanguageEnum language = null;

  @JsonProperty("ldapProvided")
  private Boolean ldapProvided = null;

  @JsonProperty("names")
  private String names = null;

  @JsonProperty("organizationId")
  private UUID organizationId = null;

  @JsonProperty("organizationName")
  private String organizationName = null;

  /**
   * Gets or Sets organizationRole
   */
  public enum OrganizationRoleEnum {
    ADMIN("ADMIN"),
    
    AUDITOR("AUDITOR"),
    
    SECURITY_ANALYST("SECURITY_ANALYST"),
    
    SYSADMIN("SYSADMIN"),
    
    DEVELOPER("DEVELOPER"),
    
    MANAGER("MANAGER"),
    
    IT("IT"),
    
    BUSINESS_ANALYST("BUSINESS_ANALYST"),
    
    PUBLIC_USER("PUBLIC_USER");

    private String value;

    OrganizationRoleEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OrganizationRoleEnum fromValue(String text) {
      for (OrganizationRoleEnum b : OrganizationRoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("organizationRole")
  private OrganizationRoleEnum organizationRole = null;

  @JsonProperty("paymentsEnabled")
  private Boolean paymentsEnabled = null;

  @JsonProperty("position")
  private String position = null;

  @JsonProperty("profilePicture")
  private byte[] profilePicture = null;

  @JsonProperty("publicUser")
  private Boolean publicUser = null;

  @JsonProperty("receiveUpdates")
  private Boolean receiveUpdates = null;

  @JsonProperty("seasonedUser")
  private Boolean seasonedUser = null;

  @JsonProperty("timezone")
  private String timezone = null;

  @JsonProperty("twoFactorAuthEnabled")
  private Boolean twoFactorAuthEnabled = null;

  @JsonProperty("twoFactorAuthKey")
  private String twoFactorAuthKey = null;

  @JsonProperty("whitelabelStyling")
  private WhitelabelStyling whitelabelStyling = null;

  public UserDetails admin(Boolean admin) {
    this.admin = admin;
    return this;
  }

   /**
   * Get admin
   * @return admin
  **/
  @ApiModelProperty(value = "")
  public Boolean isAdmin() {
    return admin;
  }

  public void setAdmin(Boolean admin) {
    this.admin = admin;
  }

  public UserDetails allowedApplicationIds(List<UUID> allowedApplicationIds) {
    this.allowedApplicationIds = allowedApplicationIds;
    return this;
  }

  public UserDetails addAllowedApplicationIdsItem(UUID allowedApplicationIdsItem) {
    if (this.allowedApplicationIds == null) {
      this.allowedApplicationIds = new ArrayList<>();
    }
    this.allowedApplicationIds.add(allowedApplicationIdsItem);
    return this;
  }

   /**
   * Get allowedApplicationIds
   * @return allowedApplicationIds
  **/
  @ApiModelProperty(value = "")
  public List<UUID> getAllowedApplicationIds() {
    return allowedApplicationIds;
  }

  public void setAllowedApplicationIds(List<UUID> allowedApplicationIds) {
    this.allowedApplicationIds = allowedApplicationIds;
  }

  public UserDetails base64ProfilePicture(String base64ProfilePicture) {
    this.base64ProfilePicture = base64ProfilePicture;
    return this;
  }

   /**
   * Get base64ProfilePicture
   * @return base64ProfilePicture
  **/
  @ApiModelProperty(value = "")
  public String getBase64ProfilePicture() {
    return base64ProfilePicture;
  }

  public void setBase64ProfilePicture(String base64ProfilePicture) {
    this.base64ProfilePicture = base64ProfilePicture;
  }

  public UserDetails confirmed(Boolean confirmed) {
    this.confirmed = confirmed;
    return this;
  }

   /**
   * Get confirmed
   * @return confirmed
  **/
  @ApiModelProperty(value = "")
  public Boolean isConfirmed() {
    return confirmed;
  }

  public void setConfirmed(Boolean confirmed) {
    this.confirmed = confirmed;
  }

  public UserDetails created(LocalDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public LocalDateTime getCreated() {
    return created;
  }

  public void setCreated(LocalDateTime created) {
    this.created = created;
  }

  public UserDetails demo(Boolean demo) {
    this.demo = demo;
    return this;
  }

   /**
   * Get demo
   * @return demo
  **/
  @ApiModelProperty(value = "")
  public Boolean isDemo() {
    return demo;
  }

  public void setDemo(Boolean demo) {
    this.demo = demo;
  }

  public UserDetails email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserDetails expirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
  }

  public UserDetails expired(Boolean expired) {
    this.expired = expired;
    return this;
  }

   /**
   * Get expired
   * @return expired
  **/
  @ApiModelProperty(value = "")
  public Boolean isExpired() {
    return expired;
  }

  public void setExpired(Boolean expired) {
    this.expired = expired;
  }

  public UserDetails features(List<String> features) {
    this.features = features;
    return this;
  }

  public UserDetails addFeaturesItem(String featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @ApiModelProperty(value = "")
  public List<String> getFeatures() {
    return features;
  }

  public void setFeatures(List<String> features) {
    this.features = features;
  }

  public UserDetails hasPassword(Boolean hasPassword) {
    this.hasPassword = hasPassword;
    return this;
  }

   /**
   * Get hasPassword
   * @return hasPassword
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasPassword() {
    return hasPassword;
  }

  public void setHasPassword(Boolean hasPassword) {
    this.hasPassword = hasPassword;
  }

  public UserDetails id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public UserDetails integratedCloudProviderId(String integratedCloudProviderId) {
    this.integratedCloudProviderId = integratedCloudProviderId;
    return this;
  }

   /**
   * Get integratedCloudProviderId
   * @return integratedCloudProviderId
  **/
  @ApiModelProperty(value = "")
  public String getIntegratedCloudProviderId() {
    return integratedCloudProviderId;
  }

  public void setIntegratedCloudProviderId(String integratedCloudProviderId) {
    this.integratedCloudProviderId = integratedCloudProviderId;
  }

  public UserDetails language(LanguageEnum language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @ApiModelProperty(value = "")
  public LanguageEnum getLanguage() {
    return language;
  }

  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }

  public UserDetails ldapProvided(Boolean ldapProvided) {
    this.ldapProvided = ldapProvided;
    return this;
  }

   /**
   * Get ldapProvided
   * @return ldapProvided
  **/
  @ApiModelProperty(value = "")
  public Boolean isLdapProvided() {
    return ldapProvided;
  }

  public void setLdapProvided(Boolean ldapProvided) {
    this.ldapProvided = ldapProvided;
  }

  public UserDetails names(String names) {
    this.names = names;
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  @ApiModelProperty(value = "")
  public String getNames() {
    return names;
  }

  public void setNames(String names) {
    this.names = names;
  }

  public UserDetails organizationId(UUID organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @ApiModelProperty(value = "")
  public UUID getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(UUID organizationId) {
    this.organizationId = organizationId;
  }

  public UserDetails organizationName(String organizationName) {
    this.organizationName = organizationName;
    return this;
  }

   /**
   * Get organizationName
   * @return organizationName
  **/
  @ApiModelProperty(value = "")
  public String getOrganizationName() {
    return organizationName;
  }

  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }

  public UserDetails organizationRole(OrganizationRoleEnum organizationRole) {
    this.organizationRole = organizationRole;
    return this;
  }

   /**
   * Get organizationRole
   * @return organizationRole
  **/
  @ApiModelProperty(value = "")
  public OrganizationRoleEnum getOrganizationRole() {
    return organizationRole;
  }

  public void setOrganizationRole(OrganizationRoleEnum organizationRole) {
    this.organizationRole = organizationRole;
  }

  public UserDetails paymentsEnabled(Boolean paymentsEnabled) {
    this.paymentsEnabled = paymentsEnabled;
    return this;
  }

   /**
   * Get paymentsEnabled
   * @return paymentsEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isPaymentsEnabled() {
    return paymentsEnabled;
  }

  public void setPaymentsEnabled(Boolean paymentsEnabled) {
    this.paymentsEnabled = paymentsEnabled;
  }

  public UserDetails position(String position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(value = "")
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public UserDetails profilePicture(byte[] profilePicture) {
    this.profilePicture = profilePicture;
    return this;
  }

   /**
   * Get profilePicture
   * @return profilePicture
  **/
  @ApiModelProperty(value = "")
  public byte[] getProfilePicture() {
    return profilePicture;
  }

  public void setProfilePicture(byte[] profilePicture) {
    this.profilePicture = profilePicture;
  }

  public UserDetails publicUser(Boolean publicUser) {
    this.publicUser = publicUser;
    return this;
  }

   /**
   * Get publicUser
   * @return publicUser
  **/
  @ApiModelProperty(value = "")
  public Boolean isPublicUser() {
    return publicUser;
  }

  public void setPublicUser(Boolean publicUser) {
    this.publicUser = publicUser;
  }

  public UserDetails receiveUpdates(Boolean receiveUpdates) {
    this.receiveUpdates = receiveUpdates;
    return this;
  }

   /**
   * Get receiveUpdates
   * @return receiveUpdates
  **/
  @ApiModelProperty(value = "")
  public Boolean isReceiveUpdates() {
    return receiveUpdates;
  }

  public void setReceiveUpdates(Boolean receiveUpdates) {
    this.receiveUpdates = receiveUpdates;
  }

  public UserDetails seasonedUser(Boolean seasonedUser) {
    this.seasonedUser = seasonedUser;
    return this;
  }

   /**
   * Get seasonedUser
   * @return seasonedUser
  **/
  @ApiModelProperty(value = "")
  public Boolean isSeasonedUser() {
    return seasonedUser;
  }

  public void setSeasonedUser(Boolean seasonedUser) {
    this.seasonedUser = seasonedUser;
  }

  public UserDetails timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @ApiModelProperty(value = "")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public UserDetails twoFactorAuthEnabled(Boolean twoFactorAuthEnabled) {
    this.twoFactorAuthEnabled = twoFactorAuthEnabled;
    return this;
  }

   /**
   * Get twoFactorAuthEnabled
   * @return twoFactorAuthEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isTwoFactorAuthEnabled() {
    return twoFactorAuthEnabled;
  }

  public void setTwoFactorAuthEnabled(Boolean twoFactorAuthEnabled) {
    this.twoFactorAuthEnabled = twoFactorAuthEnabled;
  }

  public UserDetails twoFactorAuthKey(String twoFactorAuthKey) {
    this.twoFactorAuthKey = twoFactorAuthKey;
    return this;
  }

   /**
   * Get twoFactorAuthKey
   * @return twoFactorAuthKey
  **/
  @ApiModelProperty(value = "")
  public String getTwoFactorAuthKey() {
    return twoFactorAuthKey;
  }

  public void setTwoFactorAuthKey(String twoFactorAuthKey) {
    this.twoFactorAuthKey = twoFactorAuthKey;
  }

  public UserDetails whitelabelStyling(WhitelabelStyling whitelabelStyling) {
    this.whitelabelStyling = whitelabelStyling;
    return this;
  }

   /**
   * Get whitelabelStyling
   * @return whitelabelStyling
  **/
  @ApiModelProperty(value = "")
  public WhitelabelStyling getWhitelabelStyling() {
    return whitelabelStyling;
  }

  public void setWhitelabelStyling(WhitelabelStyling whitelabelStyling) {
    this.whitelabelStyling = whitelabelStyling;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDetails userDetails = (UserDetails) o;
    return Objects.equals(this.admin, userDetails.admin) &&
        Objects.equals(this.allowedApplicationIds, userDetails.allowedApplicationIds) &&
        Objects.equals(this.base64ProfilePicture, userDetails.base64ProfilePicture) &&
        Objects.equals(this.confirmed, userDetails.confirmed) &&
        Objects.equals(this.created, userDetails.created) &&
        Objects.equals(this.demo, userDetails.demo) &&
        Objects.equals(this.email, userDetails.email) &&
        Objects.equals(this.expirationDate, userDetails.expirationDate) &&
        Objects.equals(this.expired, userDetails.expired) &&
        Objects.equals(this.features, userDetails.features) &&
        Objects.equals(this.hasPassword, userDetails.hasPassword) &&
        Objects.equals(this.id, userDetails.id) &&
        Objects.equals(this.integratedCloudProviderId, userDetails.integratedCloudProviderId) &&
        Objects.equals(this.language, userDetails.language) &&
        Objects.equals(this.ldapProvided, userDetails.ldapProvided) &&
        Objects.equals(this.names, userDetails.names) &&
        Objects.equals(this.organizationId, userDetails.organizationId) &&
        Objects.equals(this.organizationName, userDetails.organizationName) &&
        Objects.equals(this.organizationRole, userDetails.organizationRole) &&
        Objects.equals(this.paymentsEnabled, userDetails.paymentsEnabled) &&
        Objects.equals(this.position, userDetails.position) &&
        Objects.equals(this.profilePicture, userDetails.profilePicture) &&
        Objects.equals(this.publicUser, userDetails.publicUser) &&
        Objects.equals(this.receiveUpdates, userDetails.receiveUpdates) &&
        Objects.equals(this.seasonedUser, userDetails.seasonedUser) &&
        Objects.equals(this.timezone, userDetails.timezone) &&
        Objects.equals(this.twoFactorAuthEnabled, userDetails.twoFactorAuthEnabled) &&
        Objects.equals(this.twoFactorAuthKey, userDetails.twoFactorAuthKey) &&
        Objects.equals(this.whitelabelStyling, userDetails.whitelabelStyling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(admin, allowedApplicationIds, base64ProfilePicture, confirmed, created, demo, email, expirationDate, expired, features, hasPassword, id, integratedCloudProviderId, language, ldapProvided, names, organizationId, organizationName, organizationRole, paymentsEnabled, position, profilePicture, publicUser, receiveUpdates, seasonedUser, timezone, twoFactorAuthEnabled, twoFactorAuthKey, whitelabelStyling);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDetails {\n");
    
    sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
    sb.append("    allowedApplicationIds: ").append(toIndentedString(allowedApplicationIds)).append("\n");
    sb.append("    base64ProfilePicture: ").append(toIndentedString(base64ProfilePicture)).append("\n");
    sb.append("    confirmed: ").append(toIndentedString(confirmed)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    demo: ").append(toIndentedString(demo)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    hasPassword: ").append(toIndentedString(hasPassword)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    integratedCloudProviderId: ").append(toIndentedString(integratedCloudProviderId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    ldapProvided: ").append(toIndentedString(ldapProvided)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    organizationRole: ").append(toIndentedString(organizationRole)).append("\n");
    sb.append("    paymentsEnabled: ").append(toIndentedString(paymentsEnabled)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    profilePicture: ").append(toIndentedString(profilePicture)).append("\n");
    sb.append("    publicUser: ").append(toIndentedString(publicUser)).append("\n");
    sb.append("    receiveUpdates: ").append(toIndentedString(receiveUpdates)).append("\n");
    sb.append("    seasonedUser: ").append(toIndentedString(seasonedUser)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    twoFactorAuthEnabled: ").append(toIndentedString(twoFactorAuthEnabled)).append("\n");
    sb.append("    twoFactorAuthKey: ").append(toIndentedString(twoFactorAuthKey)).append("\n");
    sb.append("    whitelabelStyling: ").append(toIndentedString(whitelabelStyling)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

