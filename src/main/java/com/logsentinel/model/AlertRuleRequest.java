/*
 * LogSentinel RESTful API
 * Read more at https://docs.logsentinel.com/en/latest/index.html
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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * AlertRuleRequest
 */

public class AlertRuleRequest {
  @JsonProperty("aggregationPeriod")
  private String aggregationPeriod = null;

  /**
   * Gets or Sets aggregationType
   */
  public enum AggregationTypeEnum {
    COUNT("COUNT"),
    
    AVG("AVG"),
    
    SUM("SUM");

    private String value;

    AggregationTypeEnum(String value) {
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
    public static AggregationTypeEnum fromValue(String text) {
      for (AggregationTypeEnum b : AggregationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("aggregationType")
  private AggregationTypeEnum aggregationType = null;

  @JsonProperty("alertDestinationIds")
  private List<UUID> alertDestinationIds = null;

  @JsonProperty("applicationId")
  private UUID applicationId = null;

  @JsonProperty("enabled")
  private Boolean enabled = null;

  @JsonProperty("groupByField")
  private String groupByField = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("searchPeriod")
  private String searchPeriod = null;

  @JsonProperty("thresholdValue")
  private Double thresholdValue = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    ST_DEV("ST_DEV"),
    
    MEAN("MEAN"),
    
    FIXED("FIXED");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  public AlertRuleRequest aggregationPeriod(String aggregationPeriod) {
    this.aggregationPeriod = aggregationPeriod;
    return this;
  }

   /**
   * Get aggregationPeriod
   * @return aggregationPeriod
  **/
  @ApiModelProperty(value = "")
  public String getAggregationPeriod() {
    return aggregationPeriod;
  }

  public void setAggregationPeriod(String aggregationPeriod) {
    this.aggregationPeriod = aggregationPeriod;
  }

  public AlertRuleRequest aggregationType(AggregationTypeEnum aggregationType) {
    this.aggregationType = aggregationType;
    return this;
  }

   /**
   * Get aggregationType
   * @return aggregationType
  **/
  @ApiModelProperty(value = "")
  public AggregationTypeEnum getAggregationType() {
    return aggregationType;
  }

  public void setAggregationType(AggregationTypeEnum aggregationType) {
    this.aggregationType = aggregationType;
  }

  public AlertRuleRequest alertDestinationIds(List<UUID> alertDestinationIds) {
    this.alertDestinationIds = alertDestinationIds;
    return this;
  }

  public AlertRuleRequest addAlertDestinationIdsItem(UUID alertDestinationIdsItem) {
    if (this.alertDestinationIds == null) {
      this.alertDestinationIds = new ArrayList<>();
    }
    this.alertDestinationIds.add(alertDestinationIdsItem);
    return this;
  }

   /**
   * Get alertDestinationIds
   * @return alertDestinationIds
  **/
  @ApiModelProperty(value = "")
  public List<UUID> getAlertDestinationIds() {
    return alertDestinationIds;
  }

  public void setAlertDestinationIds(List<UUID> alertDestinationIds) {
    this.alertDestinationIds = alertDestinationIds;
  }

  public AlertRuleRequest applicationId(UUID applicationId) {
    this.applicationId = applicationId;
    return this;
  }

   /**
   * Get applicationId
   * @return applicationId
  **/
  @ApiModelProperty(value = "")
  public UUID getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(UUID applicationId) {
    this.applicationId = applicationId;
  }

  public AlertRuleRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public AlertRuleRequest groupByField(String groupByField) {
    this.groupByField = groupByField;
    return this;
  }

   /**
   * Get groupByField
   * @return groupByField
  **/
  @ApiModelProperty(value = "")
  public String getGroupByField() {
    return groupByField;
  }

  public void setGroupByField(String groupByField) {
    this.groupByField = groupByField;
  }

  public AlertRuleRequest name(String name) {
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

  public AlertRuleRequest searchPeriod(String searchPeriod) {
    this.searchPeriod = searchPeriod;
    return this;
  }

   /**
   * Get searchPeriod
   * @return searchPeriod
  **/
  @ApiModelProperty(value = "")
  public String getSearchPeriod() {
    return searchPeriod;
  }

  public void setSearchPeriod(String searchPeriod) {
    this.searchPeriod = searchPeriod;
  }

  public AlertRuleRequest thresholdValue(Double thresholdValue) {
    this.thresholdValue = thresholdValue;
    return this;
  }

   /**
   * Get thresholdValue
   * @return thresholdValue
  **/
  @ApiModelProperty(value = "")
  public Double getThresholdValue() {
    return thresholdValue;
  }

  public void setThresholdValue(Double thresholdValue) {
    this.thresholdValue = thresholdValue;
  }

  public AlertRuleRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertRuleRequest alertRuleRequest = (AlertRuleRequest) o;
    return Objects.equals(this.aggregationPeriod, alertRuleRequest.aggregationPeriod) &&
        Objects.equals(this.aggregationType, alertRuleRequest.aggregationType) &&
        Objects.equals(this.alertDestinationIds, alertRuleRequest.alertDestinationIds) &&
        Objects.equals(this.applicationId, alertRuleRequest.applicationId) &&
        Objects.equals(this.enabled, alertRuleRequest.enabled) &&
        Objects.equals(this.groupByField, alertRuleRequest.groupByField) &&
        Objects.equals(this.name, alertRuleRequest.name) &&
        Objects.equals(this.searchPeriod, alertRuleRequest.searchPeriod) &&
        Objects.equals(this.thresholdValue, alertRuleRequest.thresholdValue) &&
        Objects.equals(this.type, alertRuleRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregationPeriod, aggregationType, alertDestinationIds, applicationId, enabled, groupByField, name, searchPeriod, thresholdValue, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertRuleRequest {\n");
    
    sb.append("    aggregationPeriod: ").append(toIndentedString(aggregationPeriod)).append("\n");
    sb.append("    aggregationType: ").append(toIndentedString(aggregationType)).append("\n");
    sb.append("    alertDestinationIds: ").append(toIndentedString(alertDestinationIds)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    groupByField: ").append(toIndentedString(groupByField)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    searchPeriod: ").append(toIndentedString(searchPeriod)).append("\n");
    sb.append("    thresholdValue: ").append(toIndentedString(thresholdValue)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

