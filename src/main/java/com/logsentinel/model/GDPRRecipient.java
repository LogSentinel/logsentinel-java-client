/*
 * RESTful API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
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

/**
 * GDPRRecipient
 */

public class GDPRRecipient {
  /**
   * Gets or Sets category
   */
  public enum CategoryEnum {
    STAFF("STAFF"),
    
    PUBLIC_AUTHORITY("PUBLIC_AUTHORITY"),
    
    CONTRACTOR("CONTRACTOR"),
    
    OTHER("OTHER");

    private String value;

    CategoryEnum(String value) {
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
    public static CategoryEnum fromValue(String text) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("category")
  private CategoryEnum category = null;

  /**
   * Gets or Sets entityType
   */
  public enum EntityTypeEnum {
    CONTROLLER("CONTROLLER"),
    
    PROCESSOR("PROCESSOR"),
    
    NON_EU_ENTITY_REPRESENTATIVE("NON_EU_ENTITY_REPRESENTATIVE"),
    
    THIRD_PARTY("THIRD_PARTY");

    private String value;

    EntityTypeEnum(String value) {
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
    public static EntityTypeEnum fromValue(String text) {
      for (EntityTypeEnum b : EntityTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("entityType")
  private EntityTypeEnum entityType = null;

  /**
   * Gets or Sets legalEntityType
   */
  public enum LegalEntityTypeEnum {
    LEGAL_PERSON("LEGAL_PERSON"),
    
    NATURAL_PERSON("NATURAL_PERSON"),
    
    PUBLIC_AUTHORITY("PUBLIC_AUTHORITY");

    private String value;

    LegalEntityTypeEnum(String value) {
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
    public static LegalEntityTypeEnum fromValue(String text) {
      for (LegalEntityTypeEnum b : LegalEntityTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("legalEntityType")
  private LegalEntityTypeEnum legalEntityType = null;

  @JsonProperty("legalIdentifier")
  private String legalIdentifier = null;

  @JsonProperty("name")
  private String name = null;

  public GDPRRecipient category(CategoryEnum category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(value = "")
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public GDPRRecipient entityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @ApiModelProperty(value = "")
  public EntityTypeEnum getEntityType() {
    return entityType;
  }

  public void setEntityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
  }

  public GDPRRecipient legalEntityType(LegalEntityTypeEnum legalEntityType) {
    this.legalEntityType = legalEntityType;
    return this;
  }

   /**
   * Get legalEntityType
   * @return legalEntityType
  **/
  @ApiModelProperty(value = "")
  public LegalEntityTypeEnum getLegalEntityType() {
    return legalEntityType;
  }

  public void setLegalEntityType(LegalEntityTypeEnum legalEntityType) {
    this.legalEntityType = legalEntityType;
  }

  public GDPRRecipient legalIdentifier(String legalIdentifier) {
    this.legalIdentifier = legalIdentifier;
    return this;
  }

   /**
   * Get legalIdentifier
   * @return legalIdentifier
  **/
  @ApiModelProperty(value = "")
  public String getLegalIdentifier() {
    return legalIdentifier;
  }

  public void setLegalIdentifier(String legalIdentifier) {
    this.legalIdentifier = legalIdentifier;
  }

  public GDPRRecipient name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GDPRRecipient gdPRRecipient = (GDPRRecipient) o;
    return Objects.equals(this.category, gdPRRecipient.category) &&
        Objects.equals(this.entityType, gdPRRecipient.entityType) &&
        Objects.equals(this.legalEntityType, gdPRRecipient.legalEntityType) &&
        Objects.equals(this.legalIdentifier, gdPRRecipient.legalIdentifier) &&
        Objects.equals(this.name, gdPRRecipient.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, entityType, legalEntityType, legalIdentifier, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GDPRRecipient {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    legalEntityType: ").append(toIndentedString(legalEntityType)).append("\n");
    sb.append("    legalIdentifier: ").append(toIndentedString(legalIdentifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

