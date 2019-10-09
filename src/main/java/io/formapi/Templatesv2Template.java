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
import io.formapi.Templatesv2TemplateDocument;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Templatesv2Template
 */
@javax.annotation.Generated(value = "io.formapi.codegen.FormApiJavaClientCodegen", date = "2019-10-10T00:08:57.730+07:00[Asia/Bangkok]")
public class Templatesv2Template {
  /**
   * Gets or Sets expirationInterval
   */
  @JsonAdapter(ExpirationIntervalEnum.Adapter.class)
  public enum ExpirationIntervalEnum {
    MINUTES("minutes"),
    
    HOURS("hours"),
    
    DAYS("days");

    private String value;

    ExpirationIntervalEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExpirationIntervalEnum fromValue(String text) {
      for (ExpirationIntervalEnum b : ExpirationIntervalEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<ExpirationIntervalEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExpirationIntervalEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExpirationIntervalEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ExpirationIntervalEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_EXPIRATION_INTERVAL = "expiration_interval";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_INTERVAL)
  private ExpirationIntervalEnum expirationInterval = null;

  public static final String SERIALIZED_NAME_PUBLIC_WEB_FORM = "public_web_form";
  @SerializedName(SERIALIZED_NAME_PUBLIC_WEB_FORM)
  private Boolean publicWebForm = null;

  public static final String SERIALIZED_NAME_WEBHOOK_URL = "webhook_url";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_URL)
  private String webhookUrl = null;

  public static final String SERIALIZED_NAME_EDITABLE_SUBMISSIONS = "editable_submissions";
  @SerializedName(SERIALIZED_NAME_EDITABLE_SUBMISSIONS)
  private Boolean editableSubmissions = null;

  public static final String SERIALIZED_NAME_EXPIRE_SUBMISSIONS = "expire_submissions";
  @SerializedName(SERIALIZED_NAME_EXPIRE_SUBMISSIONS)
  private Boolean expireSubmissions = null;

  public static final String SERIALIZED_NAME_EXPIRE_AFTER = "expire_after";
  @SerializedName(SERIALIZED_NAME_EXPIRE_AFTER)
  private BigDecimal expireAfter = null;

  public static final String SERIALIZED_NAME_ALLOW_ADDITIONAL_PROPERTIES = "allow_additional_properties";
  @SerializedName(SERIALIZED_NAME_ALLOW_ADDITIONAL_PROPERTIES)
  private Boolean allowAdditionalProperties = null;

  public static final String SERIALIZED_NAME_DOCUMENT = "document";
  @SerializedName(SERIALIZED_NAME_DOCUMENT)
  private Templatesv2TemplateDocument document = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PUBLIC_SUBMISSIONS = "public_submissions";
  @SerializedName(SERIALIZED_NAME_PUBLIC_SUBMISSIONS)
  private Boolean publicSubmissions = null;

  public static final String SERIALIZED_NAME_SLACK_WEBHOOK_URL = "slack_webhook_url";
  @SerializedName(SERIALIZED_NAME_SLACK_WEBHOOK_URL)
  private String slackWebhookUrl = null;

  public static final String SERIALIZED_NAME_REDIRECT_URL = "redirect_url";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URL)
  private String redirectUrl = null;

  public Templatesv2Template expirationInterval(ExpirationIntervalEnum expirationInterval) {
    this.expirationInterval = expirationInterval;
    return this;
  }

   /**
   * Get expirationInterval
   * @return expirationInterval
  **/
  @ApiModelProperty(value = "")
  public ExpirationIntervalEnum getExpirationInterval() {
    return expirationInterval;
  }

  public void setExpirationInterval(ExpirationIntervalEnum expirationInterval) {
    this.expirationInterval = expirationInterval;
  }

  public Templatesv2Template publicWebForm(Boolean publicWebForm) {
    this.publicWebForm = publicWebForm;
    return this;
  }

   /**
   * Get publicWebForm
   * @return publicWebForm
  **/
  @ApiModelProperty(value = "")
  public Boolean getPublicWebForm() {
    return publicWebForm;
  }

  public void setPublicWebForm(Boolean publicWebForm) {
    this.publicWebForm = publicWebForm;
  }

  public Templatesv2Template webhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
    return this;
  }

   /**
   * Get webhookUrl
   * @return webhookUrl
  **/
  @ApiModelProperty(value = "")
  public String getWebhookUrl() {
    return webhookUrl;
  }

  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }

  public Templatesv2Template editableSubmissions(Boolean editableSubmissions) {
    this.editableSubmissions = editableSubmissions;
    return this;
  }

   /**
   * Get editableSubmissions
   * @return editableSubmissions
  **/
  @ApiModelProperty(value = "")
  public Boolean getEditableSubmissions() {
    return editableSubmissions;
  }

  public void setEditableSubmissions(Boolean editableSubmissions) {
    this.editableSubmissions = editableSubmissions;
  }

  public Templatesv2Template expireSubmissions(Boolean expireSubmissions) {
    this.expireSubmissions = expireSubmissions;
    return this;
  }

   /**
   * Get expireSubmissions
   * @return expireSubmissions
  **/
  @ApiModelProperty(value = "")
  public Boolean getExpireSubmissions() {
    return expireSubmissions;
  }

  public void setExpireSubmissions(Boolean expireSubmissions) {
    this.expireSubmissions = expireSubmissions;
  }

  public Templatesv2Template expireAfter(BigDecimal expireAfter) {
    this.expireAfter = expireAfter;
    return this;
  }

   /**
   * Get expireAfter
   * @return expireAfter
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getExpireAfter() {
    return expireAfter;
  }

  public void setExpireAfter(BigDecimal expireAfter) {
    this.expireAfter = expireAfter;
  }

  public Templatesv2Template allowAdditionalProperties(Boolean allowAdditionalProperties) {
    this.allowAdditionalProperties = allowAdditionalProperties;
    return this;
  }

   /**
   * Get allowAdditionalProperties
   * @return allowAdditionalProperties
  **/
  @ApiModelProperty(value = "")
  public Boolean getAllowAdditionalProperties() {
    return allowAdditionalProperties;
  }

  public void setAllowAdditionalProperties(Boolean allowAdditionalProperties) {
    this.allowAdditionalProperties = allowAdditionalProperties;
  }

  public Templatesv2Template document(Templatesv2TemplateDocument document) {
    this.document = document;
    return this;
  }

   /**
   * Get document
   * @return document
  **/
  @ApiModelProperty(value = "")
  public Templatesv2TemplateDocument getDocument() {
    return document;
  }

  public void setDocument(Templatesv2TemplateDocument document) {
    this.document = document;
  }

  public Templatesv2Template name(String name) {
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

  public Templatesv2Template publicSubmissions(Boolean publicSubmissions) {
    this.publicSubmissions = publicSubmissions;
    return this;
  }

   /**
   * Get publicSubmissions
   * @return publicSubmissions
  **/
  @ApiModelProperty(value = "")
  public Boolean getPublicSubmissions() {
    return publicSubmissions;
  }

  public void setPublicSubmissions(Boolean publicSubmissions) {
    this.publicSubmissions = publicSubmissions;
  }

  public Templatesv2Template slackWebhookUrl(String slackWebhookUrl) {
    this.slackWebhookUrl = slackWebhookUrl;
    return this;
  }

   /**
   * Get slackWebhookUrl
   * @return slackWebhookUrl
  **/
  @ApiModelProperty(value = "")
  public String getSlackWebhookUrl() {
    return slackWebhookUrl;
  }

  public void setSlackWebhookUrl(String slackWebhookUrl) {
    this.slackWebhookUrl = slackWebhookUrl;
  }

  public Templatesv2Template redirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * Get redirectUrl
   * @return redirectUrl
  **/
  @ApiModelProperty(value = "")
  public String getRedirectUrl() {
    return redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Templatesv2Template templatesv2Template = (Templatesv2Template) o;
    return Objects.equals(this.expirationInterval, templatesv2Template.expirationInterval) &&
        Objects.equals(this.publicWebForm, templatesv2Template.publicWebForm) &&
        Objects.equals(this.webhookUrl, templatesv2Template.webhookUrl) &&
        Objects.equals(this.editableSubmissions, templatesv2Template.editableSubmissions) &&
        Objects.equals(this.expireSubmissions, templatesv2Template.expireSubmissions) &&
        Objects.equals(this.expireAfter, templatesv2Template.expireAfter) &&
        Objects.equals(this.allowAdditionalProperties, templatesv2Template.allowAdditionalProperties) &&
        Objects.equals(this.document, templatesv2Template.document) &&
        Objects.equals(this.name, templatesv2Template.name) &&
        Objects.equals(this.publicSubmissions, templatesv2Template.publicSubmissions) &&
        Objects.equals(this.slackWebhookUrl, templatesv2Template.slackWebhookUrl) &&
        Objects.equals(this.redirectUrl, templatesv2Template.redirectUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirationInterval, publicWebForm, webhookUrl, editableSubmissions, expireSubmissions, expireAfter, allowAdditionalProperties, document, name, publicSubmissions, slackWebhookUrl, redirectUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Templatesv2Template {\n");
    
    sb.append("    expirationInterval: ").append(toIndentedString(expirationInterval)).append("\n");
    sb.append("    publicWebForm: ").append(toIndentedString(publicWebForm)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    editableSubmissions: ").append(toIndentedString(editableSubmissions)).append("\n");
    sb.append("    expireSubmissions: ").append(toIndentedString(expireSubmissions)).append("\n");
    sb.append("    expireAfter: ").append(toIndentedString(expireAfter)).append("\n");
    sb.append("    allowAdditionalProperties: ").append(toIndentedString(allowAdditionalProperties)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    publicSubmissions: ").append(toIndentedString(publicSubmissions)).append("\n");
    sb.append("    slackWebhookUrl: ").append(toIndentedString(slackWebhookUrl)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
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

