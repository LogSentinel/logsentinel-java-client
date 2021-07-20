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
import java.util.ArrayList;
import java.util.List;

/**
 * ConnectorStatusDto
 */

public class ConnectorStatusDto {
  @JsonProperty("additionalMessage")
  private String additionalMessage = null;

  @JsonProperty("connectorId")
  private String connectorId = null;

  @JsonProperty("connectorName")
  private String connectorName = null;

  @JsonProperty("dataSourceIds")
  private List<String> dataSourceIds = null;

  @JsonProperty("newlyCreated")
  private Boolean newlyCreated = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    SYS_INIT("SYS_INIT"),
    
    STARTUP("STARTUP"),
    
    UP("UP"),
    
    SOME_ISSUES("SOME_ISSUES"),
    
    SEVERE_ERROR("SEVERE_ERROR"),
    
    SHUTDOWN("SHUTDOWN"),
    
    DOWN("DOWN");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("type")
  private String type = null;

  public ConnectorStatusDto additionalMessage(String additionalMessage) {
    this.additionalMessage = additionalMessage;
    return this;
  }

   /**
   * Get additionalMessage
   * @return additionalMessage
  **/
  @ApiModelProperty(value = "")
  public String getAdditionalMessage() {
    return additionalMessage;
  }

  public void setAdditionalMessage(String additionalMessage) {
    this.additionalMessage = additionalMessage;
  }

  public ConnectorStatusDto connectorId(String connectorId) {
    this.connectorId = connectorId;
    return this;
  }

   /**
   * Get connectorId
   * @return connectorId
  **/
  @ApiModelProperty(value = "")
  public String getConnectorId() {
    return connectorId;
  }

  public void setConnectorId(String connectorId) {
    this.connectorId = connectorId;
  }

  public ConnectorStatusDto connectorName(String connectorName) {
    this.connectorName = connectorName;
    return this;
  }

   /**
   * Get connectorName
   * @return connectorName
  **/
  @ApiModelProperty(value = "")
  public String getConnectorName() {
    return connectorName;
  }

  public void setConnectorName(String connectorName) {
    this.connectorName = connectorName;
  }

  public ConnectorStatusDto dataSourceIds(List<String> dataSourceIds) {
    this.dataSourceIds = dataSourceIds;
    return this;
  }

  public ConnectorStatusDto addDataSourceIdsItem(String dataSourceIdsItem) {
    if (this.dataSourceIds == null) {
      this.dataSourceIds = new ArrayList<>();
    }
    this.dataSourceIds.add(dataSourceIdsItem);
    return this;
  }

   /**
   * Get dataSourceIds
   * @return dataSourceIds
  **/
  @ApiModelProperty(value = "")
  public List<String> getDataSourceIds() {
    return dataSourceIds;
  }

  public void setDataSourceIds(List<String> dataSourceIds) {
    this.dataSourceIds = dataSourceIds;
  }

  public ConnectorStatusDto newlyCreated(Boolean newlyCreated) {
    this.newlyCreated = newlyCreated;
    return this;
  }

   /**
   * Get newlyCreated
   * @return newlyCreated
  **/
  @ApiModelProperty(value = "")
  public Boolean isNewlyCreated() {
    return newlyCreated;
  }

  public void setNewlyCreated(Boolean newlyCreated) {
    this.newlyCreated = newlyCreated;
  }

  public ConnectorStatusDto status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ConnectorStatusDto type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
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
    ConnectorStatusDto connectorStatusDto = (ConnectorStatusDto) o;
    return Objects.equals(this.additionalMessage, connectorStatusDto.additionalMessage) &&
        Objects.equals(this.connectorId, connectorStatusDto.connectorId) &&
        Objects.equals(this.connectorName, connectorStatusDto.connectorName) &&
        Objects.equals(this.dataSourceIds, connectorStatusDto.dataSourceIds) &&
        Objects.equals(this.newlyCreated, connectorStatusDto.newlyCreated) &&
        Objects.equals(this.status, connectorStatusDto.status) &&
        Objects.equals(this.type, connectorStatusDto.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalMessage, connectorId, connectorName, dataSourceIds, newlyCreated, status, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorStatusDto {\n");
    
    sb.append("    additionalMessage: ").append(toIndentedString(additionalMessage)).append("\n");
    sb.append("    connectorId: ").append(toIndentedString(connectorId)).append("\n");
    sb.append("    connectorName: ").append(toIndentedString(connectorName)).append("\n");
    sb.append("    dataSourceIds: ").append(toIndentedString(dataSourceIds)).append("\n");
    sb.append("    newlyCreated: ").append(toIndentedString(newlyCreated)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

