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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * WorkingHoursDto
 */

public class WorkingHoursDto {
  @JsonProperty("applicationId")
  private UUID applicationId = null;

  @JsonProperty("applicationName")
  private String applicationName = null;

  @JsonProperty("endStr")
  private String endStr = null;

  @JsonProperty("holidays")
  private List<String> holidays = null;

  @JsonProperty("id")
  private UUID id = null;

  /**
   * Gets or Sets nonWorking
   */
  public enum NonWorkingEnum {
    MONDAY("MONDAY"),
    
    TUESDAY("TUESDAY"),
    
    WEDNESDAY("WEDNESDAY"),
    
    THURSDAY("THURSDAY"),
    
    FRIDAY("FRIDAY"),
    
    SATURDAY("SATURDAY"),
    
    SUNDAY("SUNDAY");

    private String value;

    NonWorkingEnum(String value) {
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
    public static NonWorkingEnum fromValue(String text) {
      for (NonWorkingEnum b : NonWorkingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("nonWorking")
  private List<NonWorkingEnum> nonWorking = null;

  @JsonProperty("offset")
  private String offset = null;

  @JsonProperty("organizationId")
  private UUID organizationId = null;

  @JsonProperty("startStr")
  private String startStr = null;

  public WorkingHoursDto applicationId(UUID applicationId) {
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

  public WorkingHoursDto applicationName(String applicationName) {
    this.applicationName = applicationName;
    return this;
  }

   /**
   * Get applicationName
   * @return applicationName
  **/
  @ApiModelProperty(value = "")
  public String getApplicationName() {
    return applicationName;
  }

  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }

  public WorkingHoursDto endStr(String endStr) {
    this.endStr = endStr;
    return this;
  }

   /**
   * Get endStr
   * @return endStr
  **/
  @ApiModelProperty(value = "")
  public String getEndStr() {
    return endStr;
  }

  public void setEndStr(String endStr) {
    this.endStr = endStr;
  }

  public WorkingHoursDto holidays(List<String> holidays) {
    this.holidays = holidays;
    return this;
  }

  public WorkingHoursDto addHolidaysItem(String holidaysItem) {
    if (this.holidays == null) {
      this.holidays = new ArrayList<>();
    }
    this.holidays.add(holidaysItem);
    return this;
  }

   /**
   * Get holidays
   * @return holidays
  **/
  @ApiModelProperty(value = "")
  public List<String> getHolidays() {
    return holidays;
  }

  public void setHolidays(List<String> holidays) {
    this.holidays = holidays;
  }

  public WorkingHoursDto id(UUID id) {
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

  public WorkingHoursDto nonWorking(List<NonWorkingEnum> nonWorking) {
    this.nonWorking = nonWorking;
    return this;
  }

  public WorkingHoursDto addNonWorkingItem(NonWorkingEnum nonWorkingItem) {
    if (this.nonWorking == null) {
      this.nonWorking = new ArrayList<>();
    }
    this.nonWorking.add(nonWorkingItem);
    return this;
  }

   /**
   * Get nonWorking
   * @return nonWorking
  **/
  @ApiModelProperty(value = "")
  public List<NonWorkingEnum> getNonWorking() {
    return nonWorking;
  }

  public void setNonWorking(List<NonWorkingEnum> nonWorking) {
    this.nonWorking = nonWorking;
  }

  public WorkingHoursDto offset(String offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @ApiModelProperty(value = "")
  public String getOffset() {
    return offset;
  }

  public void setOffset(String offset) {
    this.offset = offset;
  }

  public WorkingHoursDto organizationId(UUID organizationId) {
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

  public WorkingHoursDto startStr(String startStr) {
    this.startStr = startStr;
    return this;
  }

   /**
   * Get startStr
   * @return startStr
  **/
  @ApiModelProperty(value = "")
  public String getStartStr() {
    return startStr;
  }

  public void setStartStr(String startStr) {
    this.startStr = startStr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkingHoursDto workingHoursDto = (WorkingHoursDto) o;
    return Objects.equals(this.applicationId, workingHoursDto.applicationId) &&
        Objects.equals(this.applicationName, workingHoursDto.applicationName) &&
        Objects.equals(this.endStr, workingHoursDto.endStr) &&
        Objects.equals(this.holidays, workingHoursDto.holidays) &&
        Objects.equals(this.id, workingHoursDto.id) &&
        Objects.equals(this.nonWorking, workingHoursDto.nonWorking) &&
        Objects.equals(this.offset, workingHoursDto.offset) &&
        Objects.equals(this.organizationId, workingHoursDto.organizationId) &&
        Objects.equals(this.startStr, workingHoursDto.startStr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, applicationName, endStr, holidays, id, nonWorking, offset, organizationId, startStr);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkingHoursDto {\n");
    
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    endStr: ").append(toIndentedString(endStr)).append("\n");
    sb.append("    holidays: ").append(toIndentedString(holidays)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nonWorking: ").append(toIndentedString(nonWorking)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    startStr: ").append(toIndentedString(startStr)).append("\n");
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

