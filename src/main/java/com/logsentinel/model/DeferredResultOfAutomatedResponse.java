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

/**
 * DeferredResultOfAutomatedResponse
 */

public class DeferredResultOfAutomatedResponse {
  @JsonProperty("result")
  private Object result = null;

  @JsonProperty("setOrExpired")
  private Boolean setOrExpired = null;

  public DeferredResultOfAutomatedResponse result(Object result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")
  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }

  public DeferredResultOfAutomatedResponse setOrExpired(Boolean setOrExpired) {
    this.setOrExpired = setOrExpired;
    return this;
  }

   /**
   * Get setOrExpired
   * @return setOrExpired
  **/
  @ApiModelProperty(value = "")
  public Boolean isSetOrExpired() {
    return setOrExpired;
  }

  public void setSetOrExpired(Boolean setOrExpired) {
    this.setOrExpired = setOrExpired;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeferredResultOfAutomatedResponse deferredResultOfAutomatedResponse = (DeferredResultOfAutomatedResponse) o;
    return Objects.equals(this.result, deferredResultOfAutomatedResponse.result) &&
        Objects.equals(this.setOrExpired, deferredResultOfAutomatedResponse.setOrExpired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, setOrExpired);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeferredResultOfAutomatedResponse {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    setOrExpired: ").append(toIndentedString(setOrExpired)).append("\n");
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
