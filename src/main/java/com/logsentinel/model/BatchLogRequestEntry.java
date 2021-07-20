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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * BatchLogRequestEntry
 */

public class BatchLogRequestEntry<T> {
  @JsonProperty("actionData")
  private ActionData<T> actionData = null;

  @JsonProperty("actorData")
  private ActorData actorData = null;

  @JsonProperty("additionalParams")
  private Map<String, String> additionalParams = null;

  @JsonProperty("binaryContent")
  private Boolean binaryContent = null;

  @JsonProperty("encryptedKeywordsList")
  private List<String> encryptedKeywordsList = null;

  @JsonProperty("params")
  private Map<String, String> params = null;

  @JsonProperty("signature")
  private String signature = null;

  
  @JsonProperty("tags")
  private List<String> tags = null;

  public BatchLogRequestEntry<T> actionData(ActionData<T> actionData) {
    this.actionData = actionData;
    return this;
  }

   /**
   * Get actionData
   * @return actionData
  **/
  @ApiModelProperty(value = "")
  public ActionData<T> getActionData() {
    return actionData;
  }

  public void setActionData(ActionData<T> actionData) {
    this.actionData = actionData;
  }

  public BatchLogRequestEntry<T> actorData(ActorData actorData) {
    this.actorData = actorData;
    return this;
  }

   /**
   * Get actorData
   * @return actorData
  **/
  @ApiModelProperty(value = "")
  public ActorData getActorData() {
    return actorData;
  }

  public void setActorData(ActorData actorData) {
    this.actorData = actorData;
  }

  public BatchLogRequestEntry<T> additionalParams(Map<String, String> additionalParams) {
    this.additionalParams = additionalParams;
    return this;
  }

  public BatchLogRequestEntry<T> putAdditionalParamsItem(String key, String additionalParamsItem) {
    if (this.additionalParams == null) {
      this.additionalParams = new HashMap<>();
    }
    this.additionalParams.put(key, additionalParamsItem);
    return this;
  }

   /**
   * Get additionalParams
   * @return additionalParams
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getAdditionalParams() {
    return additionalParams;
  }

  public void setAdditionalParams(Map<String, String> additionalParams) {
    this.additionalParams = additionalParams;
  }

  public BatchLogRequestEntry<T> binaryContent(Boolean binaryContent) {
    this.binaryContent = binaryContent;
    return this;
  }

   /**
   * Get binaryContent
   * @return binaryContent
  **/
  @ApiModelProperty(value = "")
  public Boolean isBinaryContent() {
    return binaryContent;
  }

  public void setBinaryContent(Boolean binaryContent) {
    this.binaryContent = binaryContent;
  }

  public BatchLogRequestEntry<T> encryptedKeywordsList(List<String> encryptedKeywordsList) {
    this.encryptedKeywordsList = encryptedKeywordsList;
    return this;
  }

  public BatchLogRequestEntry<T> addEncryptedKeywordsListItem(String encryptedKeywordsListItem) {
    if (this.encryptedKeywordsList == null) {
      this.encryptedKeywordsList = new ArrayList<>();
    }
    this.encryptedKeywordsList.add(encryptedKeywordsListItem);
    return this;
  }

   /**
   * Get encryptedKeywordsList
   * @return encryptedKeywordsList
  **/
  @ApiModelProperty(value = "")
  public List<String> getEncryptedKeywordsList() {
    return encryptedKeywordsList;
  }

  public void setEncryptedKeywordsList(List<String> encryptedKeywordsList) {
    this.encryptedKeywordsList = encryptedKeywordsList;
  }

  public BatchLogRequestEntry<T> params(Map<String, String> params) {
    this.params = params;
    return this;
  }

  public BatchLogRequestEntry<T> putParamsItem(String key, String paramsItem) {
    if (this.params == null) {
      this.params = new HashMap<>();
    }
    this.params.put(key, paramsItem);
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getParams() {
    return params;
  }

  public void setParams(Map<String, String> params) {
    this.params = params;
  }

  public BatchLogRequestEntry<T> signature(String signature) {
    this.signature = signature;
    return this;
  }

   /**
   * Get signature
   * @return signature
  **/
  @ApiModelProperty(value = "")
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }
  

  public BatchLogRequestEntry<T> tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public BatchLogRequestEntry<T> addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchLogRequestEntry<T> batchLogRequestEntry = (BatchLogRequestEntry<T>) o;
    return Objects.equals(this.actionData, batchLogRequestEntry.actionData) &&
        Objects.equals(this.actorData, batchLogRequestEntry.actorData) &&
        Objects.equals(this.additionalParams, batchLogRequestEntry.additionalParams) &&
        Objects.equals(this.binaryContent, batchLogRequestEntry.binaryContent) &&
        Objects.equals(this.encryptedKeywordsList, batchLogRequestEntry.encryptedKeywordsList) &&
        Objects.equals(this.params, batchLogRequestEntry.params) &&
        Objects.equals(this.signature, batchLogRequestEntry.signature) &&
        Objects.equals(this.tags, batchLogRequestEntry.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionData, actorData, additionalParams, binaryContent, encryptedKeywordsList, params, signature, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchLogRequestEntry {\n");
    
    sb.append("    actionData: ").append(toIndentedString(actionData)).append("\n");
    sb.append("    actorData: ").append(toIndentedString(actorData)).append("\n");
    sb.append("    additionalParams: ").append(toIndentedString(additionalParams)).append("\n");
    sb.append("    binaryContent: ").append(toIndentedString(binaryContent)).append("\n");
    sb.append("    encryptedKeywordsList: ").append(toIndentedString(encryptedKeywordsList)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

