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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;

/**
 * RegistrationResponse
 */

public class RegistrationResponse {
  @JsonProperty("defaultApplicationId")
  private UUID defaultApplicationId = null;

  @JsonProperty("organizationId")
  private UUID organizationId = null;

  @JsonProperty("secret")
  private String secret = null;

  @JsonProperty("userId")
  private UUID userId = null;

  public RegistrationResponse defaultApplicationId(UUID defaultApplicationId) {
    this.defaultApplicationId = defaultApplicationId;
    return this;
  }

   /**
   * Get defaultApplicationId
   * @return defaultApplicationId
  **/
  @ApiModelProperty(value = "")
  public UUID getDefaultApplicationId() {
    return defaultApplicationId;
  }

  public void setDefaultApplicationId(UUID defaultApplicationId) {
    this.defaultApplicationId = defaultApplicationId;
  }

  public RegistrationResponse organizationId(UUID organizationId) {
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

  public RegistrationResponse secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * Get secret
   * @return secret
  **/
  @ApiModelProperty(value = "")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public RegistrationResponse userId(UUID userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistrationResponse registrationResponse = (RegistrationResponse) o;
    return Objects.equals(this.defaultApplicationId, registrationResponse.defaultApplicationId) &&
        Objects.equals(this.organizationId, registrationResponse.organizationId) &&
        Objects.equals(this.secret, registrationResponse.secret) &&
        Objects.equals(this.userId, registrationResponse.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultApplicationId, organizationId, secret, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrationResponse {\n");
    
    sb.append("    defaultApplicationId: ").append(toIndentedString(defaultApplicationId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

