/*
 * API v1
 * FormAPI is a service that helps you fill out and sign PDF templates.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.formapi;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.formapi.SubmissionAction;
import io.formapi.SubmissionDataRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Submission
 */
@javax.annotation.Generated(value = "io.formapi.codegen.FormApiJavaClientCodegen", date = "2018-12-13T17:52:48.270+07:00[Asia/Bangkok]")
public class Submission {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id = null;

  public static final String SERIALIZED_NAME_TEST = "test";
  @SerializedName(SERIALIZED_NAME_TEST)
  private Boolean test = null;

  public static final String SERIALIZED_NAME_EXPIRED = "expired";
  @SerializedName(SERIALIZED_NAME_EXPIRED)
  private Boolean expired = null;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private String expiresAt = null;

  public static final String SERIALIZED_NAME_PROCESSED_AT = "processed_at";
  @SerializedName(SERIALIZED_NAME_PROCESSED_AT)
  private String processedAt = null;

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    PENDING("pending"),
    
    PROCESSED("processed"),
    
    INVALID_DATA("invalid_data"),
    
    ERROR("error"),
    
    IMAGE_DOWNLOAD_FAILED("image_download_failed"),
    
    IMAGE_PROCESSING_FAILED("image_processing_failed"),
    
    WAITING_FOR_DATA_REQUESTS("waiting_for_data_requests");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_URL = "download_url";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URL)
  private String downloadUrl = null;

  public static final String SERIALIZED_NAME_BATCH_ID = "batch_id";
  @SerializedName(SERIALIZED_NAME_BATCH_ID)
  private String batchId = null;

  public static final String SERIALIZED_NAME_DATA_REQUESTS = "data_requests";
  @SerializedName(SERIALIZED_NAME_DATA_REQUESTS)
  private List<SubmissionDataRequest> dataRequests = null;

  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<SubmissionAction> actions = null;

  public Submission id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Submission test(Boolean test) {
    this.test = test;
    return this;
  }

   /**
   * Get test
   * @return test
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getTest() {
    return test;
  }

  public void setTest(Boolean test) {
    this.test = test;
  }

  public Submission expired(Boolean expired) {
    this.expired = expired;
    return this;
  }

   /**
   * Get expired
   * @return expired
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getExpired() {
    return expired;
  }

  public void setExpired(Boolean expired) {
    this.expired = expired;
  }

  public Submission expiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Get expiresAt
   * @return expiresAt
  **/
  @ApiModelProperty(value = "")
  public String getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }

  public Submission processedAt(String processedAt) {
    this.processedAt = processedAt;
    return this;
  }

   /**
   * Get processedAt
   * @return processedAt
  **/
  @ApiModelProperty(value = "")
  public String getProcessedAt() {
    return processedAt;
  }

  public void setProcessedAt(String processedAt) {
    this.processedAt = processedAt;
  }

  public Submission state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(required = true, value = "")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public Submission metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public Submission downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * Get downloadUrl
   * @return downloadUrl
  **/
  @ApiModelProperty(value = "")
  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  public Submission batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

   /**
   * Get batchId
   * @return batchId
  **/
  @ApiModelProperty(value = "")
  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public Submission dataRequests(List<SubmissionDataRequest> dataRequests) {
    this.dataRequests = dataRequests;
    return this;
  }

  public Submission addDataRequestsItem(SubmissionDataRequest dataRequestsItem) {
    if (this.dataRequests == null) {
      this.dataRequests = new ArrayList<SubmissionDataRequest>();
    }
    this.dataRequests.add(dataRequestsItem);
    return this;
  }

   /**
   * Get dataRequests
   * @return dataRequests
  **/
  @ApiModelProperty(value = "")
  public List<SubmissionDataRequest> getDataRequests() {
    return dataRequests;
  }

  public void setDataRequests(List<SubmissionDataRequest> dataRequests) {
    this.dataRequests = dataRequests;
  }

  public Submission actions(List<SubmissionAction> actions) {
    this.actions = actions;
    return this;
  }

  public Submission addActionsItem(SubmissionAction actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<SubmissionAction>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @ApiModelProperty(value = "")
  public List<SubmissionAction> getActions() {
    return actions;
  }

  public void setActions(List<SubmissionAction> actions) {
    this.actions = actions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Submission submission = (Submission) o;
    return Objects.equals(this.id, submission.id) &&
        Objects.equals(this.test, submission.test) &&
        Objects.equals(this.expired, submission.expired) &&
        Objects.equals(this.expiresAt, submission.expiresAt) &&
        Objects.equals(this.processedAt, submission.processedAt) &&
        Objects.equals(this.state, submission.state) &&
        Objects.equals(this.metadata, submission.metadata) &&
        Objects.equals(this.downloadUrl, submission.downloadUrl) &&
        Objects.equals(this.batchId, submission.batchId) &&
        Objects.equals(this.dataRequests, submission.dataRequests) &&
        Objects.equals(this.actions, submission.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, test, expired, expiresAt, processedAt, state, metadata, downloadUrl, batchId, dataRequests, actions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Submission {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    processedAt: ").append(toIndentedString(processedAt)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    dataRequests: ").append(toIndentedString(dataRequests)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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

